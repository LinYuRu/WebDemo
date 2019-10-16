package web.app.demo.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import web.app.demo.model.ProductBean;
import web.app.demo.model.Top5SellBean;

public class NewTop5Data {
	public static final String UTF8_BOM = "\uFEFF";

	public static void main(String args[]) {

		String line = "";

		int count = 0;
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			File file = new File("data/Top5.dat");
			try (FileInputStream fis = new FileInputStream(file);
					InputStreamReader isr = new InputStreamReader(fis, "UTF8");
					BufferedReader br = new BufferedReader(isr);) {
				while ((line = br.readLine()) != null) {
					System.out.println("line=" + line);
					if (line.startsWith(UTF8_BOM)) {
						line = line.substring(1);
					}
					String[] token = line.split("\\|");
					Top5SellBean product = new Top5SellBean();
					product.setShopId(Integer.parseInt(token[0].trim()));
					product.setTop5Name(token[1]);
					product.setTop5Quantity(Integer.parseInt(token[2].trim()));
					product.setTop5Price(Double.parseDouble(token[3].trim()));
					product.setTop5Discount(Double.parseDouble(token[4].trim()));
					product.setClassDefualt(token[5]);
					product.setTop5Info(token[6]);

					// 讀取圖片檔
					Blob blob = SystemUtils2018.fileToBlob(token[7].trim());
					product.setTop5CoverImg(blob);
					product.setTop5fileName(SystemUtils2018.extractFileName(token[8].trim()));
//					Blob blob1 = SystemUtils2018.fileToBlob(token[9].trim());
//					product.setTop5CoverImg1(blob1);
//					product.setTop5fileName1(SystemUtils2018.extractFileName(token[10].trim()));
//					Blob blob2 = SystemUtils2018.fileToBlob(token[11].trim());
//					product.setTop5CoverImg2(blob2);
//					product.setTop5fileName2(SystemUtils2018.extractFileName(token[12].trim()));
//					Blob blob3 = SystemUtils2018.fileToBlob(token[13].trim());
//					product.setTop5CoverImg3(blob3);
//					product.setTop5fileName3(SystemUtils2018.extractFileName(token[14].trim()));

					session.save(product);
					System.out.println("新增一筆產品紀錄成功");
				}
				// 印出資料新增成功的訊息
				session.flush();
				System.out.println("產品資料新增成功");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			tx.commit();
		} catch (Exception e) {
			System.err.println("新建表格時發生例外: " + e.getMessage());
			e.printStackTrace();
			tx.rollback();
		}
		factory.close();
	}
}

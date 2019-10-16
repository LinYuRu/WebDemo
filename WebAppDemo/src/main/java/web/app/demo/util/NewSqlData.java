package web.app.demo.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import web.app.demo.model.ProductBean;
import web.app.demo.util.HibernateUtils;
import web.app.demo.util.SystemUtils2018;

public class NewSqlData {
	public static final String UTF8_BOM = "\uFEFF";

	public static void main(String args[]) {

		String line = "";

		int count = 0;
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			File file = new File("data/product.dat");
			try (FileInputStream fis = new FileInputStream(file);
					InputStreamReader isr = new InputStreamReader(fis, "UTF8");
					BufferedReader br = new BufferedReader(isr);) {
				while ((line = br.readLine()) != null) {
					System.out.println("line=" + line);
					if (line.startsWith(UTF8_BOM)) {
						line = line.substring(1);
					}
					String[] token = line.split("\\|");
					ProductBean product = new ProductBean();
					product.setShopId(Integer.parseInt(token[0].trim()));
					product.setProductName(token[1]);
					product.setProductQuantity(Integer.parseInt(token[2].trim()));
					product.setProductPrice(Double.parseDouble(token[3].trim()));
					product.setProductCost(Double.parseDouble(token[4].trim()));
					product.setDiscount(Double.parseDouble(token[5].trim()));
					product.setProductAddTime(Date.valueOf(token[6].trim()));
					product.setProductupdateTime(Date.valueOf(token[7].trim()));
					product.setProductCategory(token[8]);
					product.setCategoryDefualt(token[9]);
					product.setProductClass(token[10]);
					product.setClassDefualt(token[11]);
					product.setProductInfo(token[12]);
					product.setProductWeight(Double.parseDouble(token[13].trim()));
					product.setWeightDefualt(Double.parseDouble(token[14].trim()));
					product.setProductStatus(token[15]);
					product.setProductValue(token[16]);
					product.setPackageId(Integer.parseInt(token[17].trim()));

					// 讀取圖片檔
					Blob blob = SystemUtils2018.fileToBlob(token[18].trim());
					product.setCoverImage(blob);
					product.setFileName(SystemUtils2018.extractFileName(token[19].trim()));

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
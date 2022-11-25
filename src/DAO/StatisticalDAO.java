/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.Turnover;
import Utils.XJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author KietHV
 */
//Thong ke DAO
public class StatisticalDAO {
    
    String Select_all = "	select \n" +
"		oddt.IDOrder,\n" +
"		pro.IDProduct,\n" +
"		pro.ProductName,\n" +
"		SUM(oddt.Quantity) as 'Soluong',\n" +
"		(SUM(oddt.Quantity * pro.Price)) - (SUM(oddt.Quantity * pro.Price) - SUM(oddt.TotalPrice)) as 'DoanhThu'\n" +
"	from Product pro\n" +
"		join OrderDetails oddt on oddt.IDProduct = pro.IDProduct\n" +
"		join [Order] od on od.IDOrder = oddt.IDOrder\n" +
"\n" +
"	group by pro.IDProduct,pro.ProductName,oddt.IDOrder";
    
    private List<Object[]> getListOfArray(String sql,String[] cols, Object...args){
        try {
            List<Object[]> list = new ArrayList<>(); //tao doi tuong object de luu du lieu
            ResultSet rs = XJDBC.query(sql, args); //thuc hien cau lenh
            while(rs.next()){
                Object[] vals = new Object[cols.length]; 
                for (int i = 0; i < cols.length; i++) { 
                    vals[i] = rs.getObject(cols[i]); //add du lieu voi so dong tuong ung
                }
                list.add(vals);// add doi tuong vals vao list
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    //get doanh thu
    public List<Object[]> getTurnover(Date DateOrder){
        String sql = "{CALL sp_DoanhThu(?)}"; //cau lenh sql
        String[] cols = {"IDOrder","IDProduct","ProductName","Soluong","DoanhThu"};
        return getListOfArray(sql, cols,DateOrder);
    }
    
    protected List<Turnover> selectBySQL(String sql, Object... args) {
        List<Turnover> list = new ArrayList<>();
        try {
            ResultSet rs = XJDBC.query(sql, args);
            while(rs.next()){
                Turnover entity = new Turnover();
		entity.setIdOrder(rs.getString("IDOrder"));
                entity.setIDProduct(rs.getString("IDProduct"));
                entity.setProductName(rs.getString("ProductName"));
                entity.setQuantitySold(rs.getInt("Soluong"));
                entity.setTurnover(rs.getDouble("DoanhThu"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Turnover> selectALL() {
        return this.selectBySQL(Select_all);
    }
}
package virnet.experiment.dao;

import java.io.Serializable;
import java.util.List;

import virnet.experiment.basedao.BaseDAO;
import virnet.experiment.entity.ExpVerify;
//import virnet.management.util.PageUtil;

public class ExpVerifyDAO extends BaseDAO{
	 public boolean add(ExpVerify obj) {
        return super.add(obj);
    }  

   
    public void delete(ExpVerify obj) {
        super.delete(obj);
    }

	public void deleteById(Serializable id) {
        super.deleteById(ExpVerify.class, id);
    }

   
    public boolean update(ExpVerify obj) {
    	return super.update(obj);
    }

   
    public Object get(Serializable id) {
    	Object o = super.get(ExpVerify.class, id);
		return o;
    }

   
	public Object getByNProperty(String... strs) {
    	Object o = super.getByNProperty(ExpVerify.class, strs);
		return o;
    }

	public Object getUniqueByProperty(String pName, Object pValue) {
    	Object o = super.getUniqueByProperty(ExpVerify.class, pName, pValue);
		return o;
    }

   
    public Object getUniqueByHql(String hql) {
    	Object o = super.getUniqueByHql(hql);
    	return o;
    }

	public Object getUniqueBySql(String sql) {
    		Object o = super.getUniqueBySql(sql, ExpVerify.class);
    	return o;
    }

    // ////////////////////查询单个完毕////////////////

   
    @SuppressWarnings({ "rawtypes" })
	public List getList() {
    	List list = super.getList(ExpVerify.class);
    	return list;
    }

   
    @SuppressWarnings({ "rawtypes" })
	public List getListByProperty(String pName,
            Object pValue) {
    	List list = super.getListByProperty(ExpVerify.class, pName, pValue);
    	return list;	    	
    }

   
    @SuppressWarnings({ "rawtypes" })
	public List getListByProperty(String pName, Object pValue, String condition) {
    	List list = super.getListByProperty(ExpVerify.class, pName, pValue, condition);
    	return list;
    }

   
    @SuppressWarnings({ "rawtypes" })
	public List getListByNProperty(String... strs) {
    	List list = super.getListByNProperty(ExpVerify.class, strs);
    	return list;
    }

   
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public List getListByHql(String hql) {
    	List list = super.getListByHql(hql);
    	return list;
    }

   
    @SuppressWarnings("rawtypes")
	public List getListBySql(String sql) {
    	List list = super.getListBySql(sql, ExpVerify.class);
    	return list;
    }

   
//	@SuppressWarnings("rawtypes")
//	public void getListByPage(PageUtil pageUtil) {
//        super.getListByPage(Exp.class, pageUtil);
//    }
//
//	@SuppressWarnings("rawtypes")
//	public void getListByPage(String hql, PageUtil pageUtil) {
//		super.getListByPage(hql, pageUtil);
//    }
}


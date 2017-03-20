package org.Maple.core.aspect;
/**
 * 
 * ClassName: DynamicDataSourceContextHolder <br/> 
 * Function: 设置数据源名称 <br/> 
 * date: 2017年2月28日 上午10:24:58 <br/> 
 * 
 * @author panlei 
 * @version  
 * @since JDK 1.7
 */
public class DataSourceContextHolder {
	
	public static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	
	/** 
     * @Description: 设置数据源类型 
     * @param dataSourceType  数据库类型 
     * @return void 
     * @throws 
     */ 
	public static void setDataSourceType(String dataSourceType){
		contextHolder.set(dataSourceType);
	}
	
	/** 
     * @Description: 获取数据源类型 
     * @param  
     * @return String 
     * @throws 
     */ 
	public static String  getDataSourceType(){
		return contextHolder.get();
	}
	
	/** 
     * @Description: 清除数据源类型
     * @param  
     * @return void 
     * @throws 
     */  
    public static void clearDataSourceType() {  
        contextHolder.remove();  
    }  

}

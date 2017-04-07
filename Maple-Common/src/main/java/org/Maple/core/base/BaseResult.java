package org.Maple.core.base;
/**
 * 统一结果返回
 *
 * @author panlei
 * @date 2017年4月5日
 */
public class BaseResult {
	
	//返回码：1:成功，其他失败
	private Integer code;
	//成功为success，其他为失败原因
	private String message;
	//结果集
	private Object data;
	
	public BaseResult(Integer code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}

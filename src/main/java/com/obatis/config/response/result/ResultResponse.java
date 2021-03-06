package com.obatis.config.response.result;

import io.swagger.annotations.ApiModelProperty;
import org.apache.http.HttpStatus;

import java.io.Serializable;

/**
 * 数据返回装载类，引入swagger描述，接口信息一目了然
 * @author HuangLongPu
 */
public final class ResultResponse implements Serializable {

	private static final long serialVersionUID = -6855376486664900854L;

	protected ResultResponse() {}

	/**
	 * 请求状态码
	 */
	@ApiModelProperty(value = "请求状态码(200正常请求)", required = true, dataType = "int")
	private int code = HttpStatus.SC_OK;
	/**
	 * 提示信息(错误提示)
	 */
	@ApiModelProperty(value = "提示信息(错误提示)", dataType = "string")
	private String message;
	/**
	 * 返回结果
	 */
	@ApiModelProperty(value = "返回结果", dataType = "object")
	private Object result;
	/**
	 * 错误描述码
	 */
	@ApiModelProperty(value = "错误描述码", required = true, dataType = "string")
	private String errorCode;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}

package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

public class Detail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableField("d_id")
	private Integer did;//主键id
	
	@TableField("d_suid")
	private String dsuid;//用户id
	
	@TableField("d_money")
	private String dmoney;//金额
	
	@TableField("d_time")
	private String dtime;//交易时间
	
	@TableField("d_type")
	private String dtype;//明细类型
	
	@TableField("d_state")
	private String dstate;//交易状态
	
	@TableField("d_order")
	private String dorder;//订单号
	
	@TableField("d_ip")
	private String dip;//交易ip

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDsuid() {
		return dsuid;
	}

	public void setDsuid(String dsuid) {
		this.dsuid = dsuid;
	}

	public String getDmoney() {
		return dmoney;
	}

	public void setDmoney(String dmoney) {
		this.dmoney = dmoney;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getDstate() {
		return dstate;
	}

	public void setDstate(String dstate) {
		this.dstate = dstate;
	}

	public String getDorder() {
		return dorder;
	}

	public void setDorder(String dorder) {
		this.dorder = dorder;
	}

	public String getDip() {
		return dip;
	}

	public void setDip(String dip) {
		this.dip = dip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Detail(Integer did, String dsuid, String dmoney, String dtime, String dtype, String dstate, String dorder,
			String dip) {
		super();
		this.did = did;
		this.dsuid = dsuid;
		this.dmoney = dmoney;
		this.dtime = dtime;
		this.dtype = dtype;
		this.dstate = dstate;
		this.dorder = dorder;
		this.dip = dip;
	}

	public Detail() {
		super();
	}

	@Override
	public String toString() {
		return "Detail [did=" + did + ", dsuid=" + dsuid + ", dmoney=" + dmoney + ", dtime=" + dtime + ", dtype="
				+ dtype + ", dstate=" + dstate + ", dorder=" + dorder + ", dip=" + dip + "]";
	}

	
	

}

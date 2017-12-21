package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 提现
 * 2017年11月16日08:33:23
 * 操作人：zyf
 * 
 * */

public class Cash implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableField("c_id")
	private Integer cid;//主键id
	
	@TableField("c_suid")
	private Integer csuid;//用户id
	
	@TableField("c_moeny")
	private double cmoeny;//提现金额
	
	@TableField("c_card")
	private Integer ccard;//提现卡号
	
	@TableField("c_order")
	private Integer corder;//提现订单号
	
	@TableField("c_time")
	private String ctime;//提现时间
	
	@TableField("c_state")
	private String cstate;//提现状态
	
	@TableField("c_figure")
	private double cfigure;//提现后客户端余额
	
	@TableField("c_poundage")
	private double cpoundage;//手续费

	public Cash(Integer cid, Integer csuid, double cmoeny, Integer ccard, String ctime, String cstate, double cfigure,
			double cpoundage) {
		super();
		this.cid = cid;
		this.csuid = csuid;
		this.cmoeny = cmoeny;
		this.ccard = ccard;
		this.ctime = ctime;
		this.cstate = cstate;
		this.cfigure = cfigure;
		this.cpoundage = cpoundage;
	}

	public Cash() {
		super();
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getCsuid() {
		return csuid;
	}

	public void setCsuid(Integer csuid) {
		this.csuid = csuid;
	}

	public double getCmoeny() {
		return cmoeny;
	}

	public void setCmoeny(double cmoeny) {
		this.cmoeny = cmoeny;
	}

	public Integer getCcard() {
		return ccard;
	}

	public void setCcard(Integer ccard) {
		this.ccard = ccard;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getCstate() {
		return cstate;
	}

	public void setCstate(String cstate) {
		this.cstate = cstate;
	}

	public double getCfigure() {
		return cfigure;
	}

	public void setCfigure(double cfigure) {
		this.cfigure = cfigure;
	}

	public double getCpoundage() {
		return cpoundage;
	}

	public void setCpoundage(double cpoundage) {
		this.cpoundage = cpoundage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Cash [cid=" + cid + ", csuid=" + csuid + ", cmoeny=" + cmoeny + ", ccard=" + ccard + ", ctime=" + ctime
				+ ", cstate=" + cstate + ", cfigure=" + cfigure + ", cpoundage=" + cpoundage + "]";
	}
	
	
}
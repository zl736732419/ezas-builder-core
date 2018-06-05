package com.ez.domain;

/**
 * 题卡信息
 * Created by dell on 2017/2/15.
 */
public class Sheet {
	private Long id; 
	private String title; //考试标题
	private String subTitle; //科目标题
	private String subject; //当前科目
	private String sheetType; //题卡类型A3/A4/8开/16开
	private Integer num; //题卡总数
	private Integer omrSize; //omr区方格大小
	private Integer printType; //打印类型
	private Integer enableABSheetType; //是否开启AB卷
	private Integer sheetColor; //题卡颜色 黑白卡/套红卡
	private Integer gridType; //方格类型
	private Integer copyRight; //是否包含版权信息
	private Integer studentTemplateEnable; //是否包含考生信息

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSheetType() {
		return sheetType;
	}

	public void setSheetType(String sheetType) {
		this.sheetType = sheetType;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getOmrSize() {
		return omrSize;
	}

	public void setOmrSize(Integer omrSize) {
		this.omrSize = omrSize;
	}

	public Integer getPrintType() {
		return printType;
	}

	public void setPrintType(Integer printType) {
		this.printType = printType;
	}

	public Integer getEnableABSheetType() {
		return enableABSheetType;
	}

	public void setEnableABSheetType(Integer enableABSheetType) {
		this.enableABSheetType = enableABSheetType;
	}

	public Integer getSheetColor() {
		return sheetColor;
	}

	public void setSheetColor(Integer sheetColor) {
		this.sheetColor = sheetColor;
	}

	public Integer getGridType() {
		return gridType;
	}

	public void setGridType(Integer gridType) {
		this.gridType = gridType;
	}

	public Integer getCopyRight() {
		return copyRight;
	}

	public void setCopyRight(Integer copyRight) {
		this.copyRight = copyRight;
	}

	public Integer getStudentTemplateEnable() {
		return studentTemplateEnable;
	}

	public void setStudentTemplateEnable(Integer studentTemplateEnable) {
		this.studentTemplateEnable = studentTemplateEnable;
	}
}

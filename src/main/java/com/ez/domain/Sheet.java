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
	
	
	
}

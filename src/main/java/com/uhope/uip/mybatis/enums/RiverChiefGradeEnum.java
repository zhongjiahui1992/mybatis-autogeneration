package com.uhope.uip.mybatis.enums;

/**
 * 河长级别枚举类
 * @author jiangjialiang<br>2017/12/20
 * @version 3.0.0
 */
public enum RiverChiefGradeEnum {

    PROVINCE("84210348-1CA8-4E29-AD17-A75A900C04C1", "省级河长"),
    CITY("8AB54B68-256F-49E1-8396-DE3C3099FB2D", "市级河长"),
    COUNTY("A2470BBF-99C5-4854-9EE3-6B6DA49146E7", "县级河长"),
    TOWN("68E567CE-69BC-4623-B1E4-A0B8A0B06C37", "乡镇级河长"),
    VILLAGE("8D9DFB6D-F2B0-4C5E-A38A-C5B96CA44800", "村级河长");

    private String code;
    private String remark;

    RiverChiefGradeEnum(String code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

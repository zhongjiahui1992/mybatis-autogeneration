package com.uhope.uip.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "app_user")
public class AppUser implements Serializable {
    /**
     * 序号
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 记录版本
     */
    @Column(name = "RECVER")
    private Integer recver;

    /**
     * 平台ID 公众用户绑定字段
     */
    @Column(name = "PLATFORMID")
    private String platformid;

    /**
     * 手机号码
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 账号
     */
    @Column(name = "ACCOUNT")
    private String account;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    private String nickname;

    /**
     * 详细地址 详细地址,门牌信息
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 所属单位
     */
    @Column(name = "UNITS")
    private String units;

    @Column(name = "UNIONID")
    private String unionid;

    /**
     * 头像
     */
    @Column(name = "HEADPORTRAIT")
    private String headportrait;

    /**
     * 开放编号
     */
    @Column(name = "OPENID")
    private String openid;

    /**
     * 用户类型 1 APK 2 WX
     */
    @Column(name = "USERTYPE")
    private Byte usertype;

    /**
     * 注册日期
     */
    @Column(name = "REGISTERDATE")
    private Date registerdate;

    /**
     * 最后登录日期
     */
    @Column(name = "LASTLOGINDATE")
    private Date lastlogindate;

    /**
     * 性别 性别1 男 0 女
     */
    @Column(name = "GENDER")
    private Byte gender;

    /**
     * 生日
     */
    @Column(name = "BIRTHDAY")
    private String birthday;

    /**
     * 省ID
     */
    @Column(name = "PROVINCEID")
    private String provinceid;

    /**
     * 市ID
     */
    @Column(name = "CITYID")
    private String cityid;

    /**
     * 县ID
     */
    @Column(name = "COUNTYID")
    private String countyid;

    /**
     * 镇ID
     */
    @Column(name = "TOWNID")
    private String townid;

    /**
     * 村ID
     */
    @Column(name = "VILLAGEID")
    private String villageid;

    /**
     * 状态 1 初始状态 2 不可用
     */
    @Column(name = "STATUS")
    private Byte status;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 获取序号
     *
     * @return ID - 序号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取记录版本
     *
     * @return RECVER - 记录版本
     */
    public Integer getRecver() {
        return recver;
    }

    /**
     * 设置记录版本
     *
     * @param recver 记录版本
     */
    public void setRecver(Integer recver) {
        this.recver = recver;
    }

    /**
     * 获取平台ID 公众用户绑定字段
     *
     * @return PLATFORMID - 平台ID 公众用户绑定字段
     */
    public String getPlatformid() {
        return platformid;
    }

    /**
     * 设置平台ID 公众用户绑定字段
     *
     * @param platformid 平台ID 公众用户绑定字段
     */
    public void setPlatformid(String platformid) {
        this.platformid = platformid;
    }

    /**
     * 获取手机号码
     *
     * @return PHONE - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取账号
     *
     * @return ACCOUNT - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户名
     *
     * @return USERNAME - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取昵称
     *
     * @return NICKNAME - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取详细地址 详细地址,门牌信息
     *
     * @return ADDRESS - 详细地址 详细地址,门牌信息
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址 详细地址,门牌信息
     *
     * @param address 详细地址 详细地址,门牌信息
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取所属单位
     *
     * @return UNITS - 所属单位
     */
    public String getUnits() {
        return units;
    }

    /**
     * 设置所属单位
     *
     * @param units 所属单位
     */
    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * @return UNIONID
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * @param unionid
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    /**
     * 获取头像
     *
     * @return HEADPORTRAIT - 头像
     */
    public String getHeadportrait() {
        return headportrait;
    }

    /**
     * 设置头像
     *
     * @param headportrait 头像
     */
    public void setHeadportrait(String headportrait) {
        this.headportrait = headportrait;
    }

    /**
     * 获取开放编号
     *
     * @return OPENID - 开放编号
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置开放编号
     *
     * @param openid 开放编号
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取用户类型 1 APK 2 WX
     *
     * @return USERTYPE - 用户类型 1 APK 2 WX
     */
    public Byte getUsertype() {
        return usertype;
    }

    /**
     * 设置用户类型 1 APK 2 WX
     *
     * @param usertype 用户类型 1 APK 2 WX
     */
    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    /**
     * 获取注册日期
     *
     * @return REGISTERDATE - 注册日期
     */
    public Date getRegisterdate() {
        return registerdate;
    }

    /**
     * 设置注册日期
     *
     * @param registerdate 注册日期
     */
    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    /**
     * 获取最后登录日期
     *
     * @return LASTLOGINDATE - 最后登录日期
     */
    public Date getLastlogindate() {
        return lastlogindate;
    }

    /**
     * 设置最后登录日期
     *
     * @param lastlogindate 最后登录日期
     */
    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    /**
     * 获取性别 性别1 男 0 女
     *
     * @return GENDER - 性别 性别1 男 0 女
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别 性别1 男 0 女
     *
     * @param gender 性别 性别1 男 0 女
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * 获取生日
     *
     * @return BIRTHDAY - 生日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取省ID
     *
     * @return PROVINCEID - 省ID
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * 设置省ID
     *
     * @param provinceid 省ID
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * 获取市ID
     *
     * @return CITYID - 市ID
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * 设置市ID
     *
     * @param cityid 市ID
     */
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    /**
     * 获取县ID
     *
     * @return COUNTYID - 县ID
     */
    public String getCountyid() {
        return countyid;
    }

    /**
     * 设置县ID
     *
     * @param countyid 县ID
     */
    public void setCountyid(String countyid) {
        this.countyid = countyid;
    }

    /**
     * 获取镇ID
     *
     * @return TOWNID - 镇ID
     */
    public String getTownid() {
        return townid;
    }

    /**
     * 设置镇ID
     *
     * @param townid 镇ID
     */
    public void setTownid(String townid) {
        this.townid = townid;
    }

    /**
     * 获取村ID
     *
     * @return VILLAGEID - 村ID
     */
    public String getVillageid() {
        return villageid;
    }

    /**
     * 设置村ID
     *
     * @param villageid 村ID
     */
    public void setVillageid(String villageid) {
        this.villageid = villageid;
    }

    /**
     * 获取状态 1 初始状态 2 不可用
     *
     * @return STATUS - 状态 1 初始状态 2 不可用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 1 初始状态 2 不可用
     *
     * @param status 状态 1 初始状态 2 不可用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
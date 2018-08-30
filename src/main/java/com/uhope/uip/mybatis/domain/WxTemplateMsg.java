package com.uhope.uip.mybatis.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wx_template_msg")
public class WxTemplateMsg implements Serializable {
    /**
     * 公众号appid
     */
    @Column(name = "APPID")
    private String appid;

    /**
     * 消息模板的id
     */
    private String templateid;

    /**
     * 消息模板的标题
     */
    private String title;

    /**
     * 模板所属行业的一级行业
     */
    private String primaryindustry;

    /**
     * 模板所属行业的二级行业
     */
    private String deputyindustry;

    private String temptype;

    private Integer isevent;

    /**
     * 模板内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * 获取公众号appid
     *
     * @return APPID - 公众号appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置公众号appid
     *
     * @param appid 公众号appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取消息模板的id
     *
     * @return templateid - 消息模板的id
     */
    public String getTemplateid() {
        return templateid;
    }

    /**
     * 设置消息模板的id
     *
     * @param templateid 消息模板的id
     */
    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    /**
     * 获取消息模板的标题
     *
     * @return title - 消息模板的标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置消息模板的标题
     *
     * @param title 消息模板的标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取模板所属行业的一级行业
     *
     * @return primaryindustry - 模板所属行业的一级行业
     */
    public String getPrimaryindustry() {
        return primaryindustry;
    }

    /**
     * 设置模板所属行业的一级行业
     *
     * @param primaryindustry 模板所属行业的一级行业
     */
    public void setPrimaryindustry(String primaryindustry) {
        this.primaryindustry = primaryindustry;
    }

    /**
     * 获取模板所属行业的二级行业
     *
     * @return deputyindustry - 模板所属行业的二级行业
     */
    public String getDeputyindustry() {
        return deputyindustry;
    }

    /**
     * 设置模板所属行业的二级行业
     *
     * @param deputyindustry 模板所属行业的二级行业
     */
    public void setDeputyindustry(String deputyindustry) {
        this.deputyindustry = deputyindustry;
    }

    /**
     * @return temptype
     */
    public String getTemptype() {
        return temptype;
    }

    /**
     * @param temptype
     */
    public void setTemptype(String temptype) {
        this.temptype = temptype;
    }

    /**
     * @return isevent
     */
    public Integer getIsevent() {
        return isevent;
    }

    /**
     * @param isevent
     */
    public void setIsevent(Integer isevent) {
        this.isevent = isevent;
    }

    /**
     * 获取模板内容
     *
     * @return content - 模板内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置模板内容
     *
     * @param content 模板内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}
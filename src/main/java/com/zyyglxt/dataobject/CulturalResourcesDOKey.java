package com.zyyglxt.dataobject;

public class CulturalResourcesDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_cultural_resources.itemID
     *
     * @mbg.generated Fri Oct 30 16:11:19 CST 2020
     */
    private Integer itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_cultural_resources.itemCode
     *
     * @mbg.generated Fri Oct 30 16:11:19 CST 2020
     */
    private String itemcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_cultural_resources.itemID
     *
     * @return the value of tb_culpro_cultural_resources.itemID
     *
     * @mbg.generated Fri Oct 30 16:11:19 CST 2020
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_cultural_resources.itemID
     *
     * @param itemid the value for tb_culpro_cultural_resources.itemID
     *
     * @mbg.generated Fri Oct 30 16:11:19 CST 2020
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_cultural_resources.itemCode
     *
     * @return the value of tb_culpro_cultural_resources.itemCode
     *
     * @mbg.generated Fri Oct 30 16:11:19 CST 2020
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_cultural_resources.itemCode
     *
     * @param itemcode the value for tb_culpro_cultural_resources.itemCode
     *
     * @mbg.generated Fri Oct 30 16:11:19 CST 2020
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }
}
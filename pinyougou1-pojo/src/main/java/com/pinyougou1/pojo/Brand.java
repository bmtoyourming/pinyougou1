package com.pinyougou1.pojo;

public class Brand {
    /**
     * 品牌实体类
     *
     * @author lee.siu.wah
     * @version 1.0
     * <p>File Created at 2019-03-26<p>
     */  // 品牌id
    private Long id;
    // 品牌名称
    private String name;
    // 品牌首字母
    private String firstChar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}

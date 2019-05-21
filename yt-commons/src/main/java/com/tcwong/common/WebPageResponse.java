package com.tcwong.common;

import java.util.List;

public class WebPageResponse {
    private Long total;
    private List<?> data;

    public WebPageResponse() {
    }

    public WebPageResponse(Long total, List<?> data) {
        this.total = total;
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}

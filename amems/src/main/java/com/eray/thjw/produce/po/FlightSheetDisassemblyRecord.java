package com.eray.thjw.produce.po;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.eray.thjw.mapper.CustomJsonDateDeserializer;
import com.eray.thjw.po.BaseEntity;

/**
 * @Description b_s2_0060401 完成工作-拆装记录
 * @CreateTime 2017年10月24日 下午4:58:17
 * @CreateBy 韩武
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightSheetDisassemblyRecord extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	private String id;

    private String mainid;

    private Integer zt;

    private String whdwid;

    private String whrid;

    private Date whsj;

    private Integer sgbs;

    private Integer cxBs;

    private String cxZjqdid;

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date cxSj;

    private String cxBz;

    private String cxWckcid;

    private String cxKclvid;

    private Integer zsBs;

    private String zsZjqdid;

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date zsSj;

    private String zsBz;

    private String zsWckcid;

    private String zsKclvid;
    
    /** 装上件 */
    private InstallationListTemp zsj;
    
    /** 拆下件 */
    private InstallationListEditable cxj;
    
    private String gdczjlid;
    
    private String fxjldid;
    
    private String zrrid;
    
    private String zrr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMainid() {
        return mainid;
    }

    public void setMainid(String mainid) {
        this.mainid = mainid == null ? null : mainid.trim();
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public String getWhdwid() {
        return whdwid;
    }

    public void setWhdwid(String whdwid) {
        this.whdwid = whdwid == null ? null : whdwid.trim();
    }

    public String getWhrid() {
        return whrid;
    }

    public void setWhrid(String whrid) {
        this.whrid = whrid == null ? null : whrid.trim();
    }

    public Date getWhsj() {
        return whsj;
    }

    public void setWhsj(Date whsj) {
        this.whsj = whsj;
    }

    public Integer getSgbs() {
        return sgbs;
    }

    public void setSgbs(Integer sgbs) {
        this.sgbs = sgbs;
    }

    public Integer getCxBs() {
        return cxBs;
    }

    public void setCxBs(Integer cxBs) {
        this.cxBs = cxBs;
    }

    public String getCxZjqdid() {
        return cxZjqdid;
    }

    public void setCxZjqdid(String cxZjqdid) {
        this.cxZjqdid = cxZjqdid == null ? null : cxZjqdid.trim();
    }

    public Date getCxSj() {
        return cxSj;
    }

    public void setCxSj(Date cxSj) {
        this.cxSj = cxSj;
    }

    public String getCxBz() {
        return cxBz;
    }

    public void setCxBz(String cxBz) {
        this.cxBz = cxBz == null ? null : cxBz.trim();
    }

    public String getCxWckcid() {
        return cxWckcid;
    }

    public void setCxWckcid(String cxWckcid) {
        this.cxWckcid = cxWckcid == null ? null : cxWckcid.trim();
    }

    public String getCxKclvid() {
        return cxKclvid;
    }

    public void setCxKclvid(String cxKclvid) {
        this.cxKclvid = cxKclvid == null ? null : cxKclvid.trim();
    }

    public Integer getZsBs() {
        return zsBs;
    }

    public void setZsBs(Integer zsBs) {
        this.zsBs = zsBs;
    }

    public String getZsZjqdid() {
        return zsZjqdid;
    }

    public void setZsZjqdid(String zsZjqdid) {
        this.zsZjqdid = zsZjqdid == null ? null : zsZjqdid.trim();
    }

    public Date getZsSj() {
        return zsSj;
    }

    public void setZsSj(Date zsSj) {
        this.zsSj = zsSj;
    }

    public String getZsBz() {
        return zsBz;
    }

    public void setZsBz(String zsBz) {
        this.zsBz = zsBz == null ? null : zsBz.trim();
    }

    public String getZsWckcid() {
        return zsWckcid;
    }

    public void setZsWckcid(String zsWckcid) {
        this.zsWckcid = zsWckcid == null ? null : zsWckcid.trim();
    }

    public String getZsKclvid() {
        return zsKclvid;
    }

    public void setZsKclvid(String zsKclvid) {
        this.zsKclvid = zsKclvid == null ? null : zsKclvid.trim();
    }

	public InstallationListTemp getZsj() {
		return zsj;
	}

	public void setZsj(InstallationListTemp zsj) {
		this.zsj = zsj;
	}

	public InstallationListEditable getCxj() {
		return cxj;
	}

	public void setCxj(InstallationListEditable cxj) {
		this.cxj = cxj;
	}
	
	public String getGdczjlid() {
		return gdczjlid;
	}

	public void setGdczjlid(String gdczjlid) {
		this.gdczjlid = gdczjlid;
	}

	public String getFxjldid() {
		return fxjldid;
	}

	public void setFxjldid(String fxjldid) {
		this.fxjldid = fxjldid;
	}

	public String getZrrid() {
		return zrrid;
	}

	public void setZrrid(String zrrid) {
		this.zrrid = zrrid;
	}

	public String getZrr() {
		return zrr;
	}

	public void setZrr(String zrr) {
		this.zrr = zrr;
	}

	/**
	 * @Description 将飞行记录本拆装信息 对象 转换为 工单的拆装信息对象
	 * @CreateTime 2017年11月14日 上午11:16:51
	 * @CreateBy 徐勇
	 * @return
	 */
	public WorkOrderIORecord toWorkOrderIORecord(){
		WorkOrderIORecord workOrderIORecord = new WorkOrderIORecord();
		workOrderIORecord.setId(gdczjlid);
		workOrderIORecord.setZt(zt);
		workOrderIORecord.setCxBs(cxBs);
		workOrderIORecord.setCxZjqdid(cxZjqdid);
		workOrderIORecord.setCxSj(cxSj);
		workOrderIORecord.setCxBz(cxBz);
		workOrderIORecord.setCxWckcid(cxWckcid);
		workOrderIORecord.setCxKclvid(cxKclvid);
		workOrderIORecord.setZsBs(zsBs);
		workOrderIORecord.setZsZjqdid(zsZjqdid);
		workOrderIORecord.setZsSj(zsSj);
		workOrderIORecord.setZsBz(zsBz);
		workOrderIORecord.setZsWckcid(zsWckcid);
		workOrderIORecord.setZsKclvid(zsKclvid);
		workOrderIORecord.setZrrid(zrrid);
		workOrderIORecord.setZrr(zrr);
		return workOrderIORecord;
	} 
}
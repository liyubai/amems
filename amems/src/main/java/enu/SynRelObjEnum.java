package enu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  
 * @Description 系统同步关系-对象类型
 * @CreateTime 2017年9月27日 上午11:42:21
 * @CreateBy 朱超
 */
public enum SynRelObjEnum {
	OUTSOURCING_SUPPLIER(1, "外委供应商"),
	CUSTOMER(2, "客户"),
	;
	
	private Integer id;
    private String name;
    
    private SynRelObjEnum(Integer id, String name) {
    	this.id = id;
        this.name = name;
    }
    
    public static String getName(Integer id) {
        for (SynRelObjEnum c : SynRelObjEnum.values()) {
            if (c.getId().intValue() == id.intValue()) {
                return c.name;
            }
        }
        return "";
    }
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	 /**
     * 枚举转listmap
     * @return
     */
    public static List<Map<String, Object>> enumToListMap() {
    	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
    	SynRelObjEnum[] enums = SynRelObjEnum.values();
    	
    	for (SynRelObjEnum enumItem : enums) {
    		Map<String, Object>map = new HashMap<String, Object>();
    		map.put("id", enumItem.getId());
    		map.put("name", enumItem.getName());
    		list.add(map);
		}
    	
    	 Collections.sort(list, new Comparator<Map<String, Object>>() {
    	        public int compare(Map<String, Object> o1, Map<String, Object> o2) {
    	            return o1.get("name").toString().compareTo(o2.get("name").toString()) ;
    	        }
    	    });
    	
    	return list;
	}
     
}

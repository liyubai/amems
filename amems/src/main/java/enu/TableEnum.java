package enu;

/**
 * @author liub
 * @description 表枚举,用于获取数据库表名
 * @develop date 2016.08.20
 */
public enum TableEnum {
	
	_REC("历史记录后缀")
	, B_G_011("维修方案表")
	, B_G_01101("维修方案修订通知书关系表")
	,D_005("ATA章节号")
    ,D_004("机型数据")
    ,D_00401("机型数据关联部件表")
    , B_G_012("定检项目主表")
	, B_G_01202("定检工作内容表")
	, B_G_0120201("定检工作对应飞机关系表")
	, B_G_01201("定检监控项目表")
	, B_G_013("定检工卡")
	, B_G_01302("定检工卡修订通知书表")
	, B_G_001("技术文件表")
	,B_G_002("维护提示")
	,B_G_006("工单基础表")
	,B_G_00601("工单航材耗材工具信息")
	,B_G_00602("非例行工单工作内容")
	,B_G_00603("非例行工单的附件内容")
	,B_G_00604("非例行工单的执行对象信息")
	,B_G_007("非例行工单")
	,B_G_010("EO工单")
	,B_G_00605("非例行工单附加相关工卡")
	,B_G_00201("发送表")
	,B_G_004("技术指令")
	,B_G_00401("技术指令历史表")
	,B_G_005("修订通知书")
	,B_G_009("工程指令")
	,B_G_00901("工程指令明细")
	,B_G_00101("上传文件")
	,B_G_015("外形/结构修理")
	,B_G_019("Mel变更单")
	,B_G_01901("Mel变更依据")
	,B_G_008("Mel清单")
	,B_G2_000("适航性资料")
	,B_G2_00001("技术文件-评估指令")
	,B_G2_00002("质量关闭明细")
	,B_G2_001("技术评估单")
	,B_G2_00100("技术评估单-附加信息")
	,B_G2_00101("技术评估单-下达指令")
	,D_007("飞机主数据")
	,D_00701("飞机初始化数据")
	,D_00702("飞机日使用量监控指标")
	,D_008("部件主数据")
	,D_00801("航材对应机型关系表")
	,D_00802("航材对应仓库库位关系表")
	,D_00803("航材成本报价表")
	,D_009("仓库主数据")
	,D_00901("仓库库位")
	,D_010("供应商主数据")
	,D_011("附件数据表")
	,D_016("联系人数据表")
	,D_017("等效替代表")
	,D_01701("等效替代表—适用性")
	,D_019("客户")
	,D_020("项目")
	,D_02001("项目-关键部件")
	,D_015("厂商")
	,D_021("盖板管理")
	,D_023("区域-飞机站位数据")
	,D_024("阶段")
	,D_026("产权数据管理")
	,B_S_001("编辑区-飞机装机清单")
	,B_G_00102("受影响的对象")
	,B_G_00103("质量关闭")
	,B_S_00101("编辑区-时控件监控设置表")
	,B_S_00102("编辑区-时控件特殊飞行情况")
	,B_S_00103("编辑区-定检件定检项目")
	,B_S_0010301("编辑区-定检件监控项目")
	,B_G_014("定检任务主表")
	,B_G_01401("定检任务监控项目")
	,B_G_01402("定检任务工作内容")
	,B_G_016("定检工单")
	,B_S_009("计划任务")
	,B_H_003("外场虚拟库存表")
	,B_H_001("库存表")
	,B_S_014("适航指令")
	,b_s2_005("拆装记录导入")
	,B_S_006("飞行记录单")
	,B_S_00601("飞行数据明细")
	,B_S_00603("航间检查记录表")
	,B_S_00602("飞行记录关联计划")
	,B_S_0060201("拆解记录")
	,B_S_006020101("装上件-装机清单信息")
	,B_S_00602010101("装上件-时控件设置")
	,B_S_00602010103("装上件-定检件定检项目")
	,B_S_0060201010301("装上件-定检件监控项目")
	,B_S_00602010104("子部件关系")
	,B_S_00602010102("装上件-时控件特殊飞行情况")
	,B_S_013("故障保留单")
	,B_S2_013("故障保留单")
	,B_S2_01301("故障保留-监控")
	,B_S2_01302("故障保留-其他")
	,B_S2_011("项目保留单")
	,B_S2_012("缺陷保留单")
	,B_S_00901("计划任务监控数据快照")
	,B_S_01301("故障保留单-工单对应关系")
	,B_S_010("排班表")
	,B_S_01001("排班对象表")
	,B_Z_001("维修人员档案主表")
	,B_Z_00101("档案-授权记录")
	,B_Z_00102("档案-嘉奖/成就")
	,B_Z_00103("档案-工作履历")
	,B_Z_00104("档案-诚信记录")
	,B_Z_00105("档案-教育经历")
	,B_Z_00106("档案-外语水平")
	,B_Z_00107("档案-业务考核成绩")
	,B_Z_00108("档案-聘任职称")
	,B_Z_00109("档案-岗位职务")
	,B_Z_00110("档案-技术履历")
	,B_Z_00111("档案-维修技术等级升降记录")
	,B_Z_005("岗位授权")
	,B_Z_00501("岗位授权-培训评估")
	,B_Z_00502("岗位授权-人员资质评估")
	,B_J_001("机场保障部维修记录")
	,B_J_00201("巡检记录单明细")
	,B_J_002("巡检记录单")
	,B_J_004("油量统计记录")
	,B_W_001("计量工具主表")
	,B_W_00101("计量工具监控明细表")
	,B_W_002("工具/设备使用记录")
	,D_012("基地表")
	,B_P_001("岗位表")
	,B_P_00101("岗位要求表")
	,B_P_002("培训计划表")
	,B_P_00201("培训计划课程表")
	,B_P_0020101("培训计划课程的培训人员表")
	,B_P_003("课程表")
	,B_P_006("岗位人员中间表")
	,B_P_007("年度计划表")
	,B_P_008("教员管理表")
	,B_P_00801("授权课程表")
	,B_P_005("课程TO岗位表")
	,B_J_003("飞机加油单")
	,B_J_005("油品规格")
	,D_014("文档目录")
	,B_S_018("飞机载重表")
	,B_S_01801("部件震动数据表")
	,B_S_019("飞机缺陷表")
	,B_S_01901("飞机缺陷明细表")
	,B_S_0190101("飞机缺陷涉及工单表")
	,B_S2_901("监控对象")
	,B_S2_903("监控数据-上次执行数据")
	,B_S2_904("监控数据-(计划)执行数据")
	,B_H_021("销毁单")	
	,B_H_017("部件履历表")	
	,B_Z_002("自我质量审查表")
	,B_G2_011("维修方案")
	,B_G2_01101("维修项目大类")
	,B_G2_012("维修项目")
	,B_G2_013("工卡")
	,B_G2_01302("工卡-适用单位")
	,B_G2_01201("维修项目-监控项设置")
	,B_G2_01202("维修项目-关联维修项目关系")
	,B_G2_01203("维修项目对应飞机关系表")
	,B_G2_01204("维修项目-关联部件关系")
	,B_G2_01301("工卡-关联工卡")
	,B_G2_993("工种工时")
	,B_G2_995("接近/盖板")
	,B_G2_996("工作内容")
	,B_G2_997("器材/工具")
	,B_G2_999("相关参考文件")
	,B_G2_002("维护提示")
	,B_G2_998("分发部门或用户")
	,B_G2_010("EO主表")
	,B_G2_01000("EO-附加信息")
	,B_G2_01003("EO-受影响出版物")
	,B_G2_01004("EO-工时/停场时间")
	,B_G2_01002("EO-监控项设置")
	,B_G2_01001("EO-适用性")
	,B_S2_001("装机清单-编辑区")
	,B_S2_00101("装机清单-编辑区-部件初始化")
	,B_S2_002("装机清单-临时区")
	,B_S2_00201("装机清单-临时区-部件初始化")
	,B_H2_024("部件证书")
	,B_S2_008("135工单信息")
	,B_S2_00801("135工单信息-拆装记录-修改记录")
	,B_S2_014("145工单信息")
	,B_S2_01401("145工单信息-拆装记录-修改记录")
	,B_S2_007("135工包")
	,B_S2_010("145工包")
	,B_S2_01402("145工单信息-工序工时")
	,B_S2_006("飞行记录本")
	,B_S2_00601("飞行数据明细")
	,B_S2_00602("航段信息")
	,B_S2_00603("航段信息-防冰液信息")
	,B_S2_00604("航段信息-完成工作")
	,B_S2_0060401("完成工作-拆装记录")
	,B_S2_0060402("航段信息-工作者")
	,B_S2_00802("135工单信息-工作者")
	,B_S2_01403("145工单信息-工作者")
	,B_G2_00102("评估单-适用性")
	,B_G2_014("生产指令")
	,B_G2_01401("生产指令-监控项设置")
	,B_G2_01402("生产指令-飞机关系")
	;
     
    private String name;

    
    private TableEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
package com.eray.thjw.quality.control;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

import com.eray.thjw.annotation.Privilege;
import com.eray.thjw.exception.BusinessException;
import com.eray.thjw.po.Monitorsettings;
import com.eray.thjw.produce.po.Aircraftinfo;
import com.eray.thjw.project2.po.Airworthiness;
import com.eray.thjw.quality.po.Auditnotice;
import com.eray.thjw.quality.service.AuditNoticeService;

import enu.ThresholdEnum;
/**
 * 
 * @Description 审核通知单
 * @CreateTime 2017年12月26日 
 * @CreateBy 裴秀
 */
@Controller
@RequestMapping("/quality/auditnotice")
public class AuditNoticeController {
	
	@Resource
	private AuditNoticeService auditnoticeService;

	/**
	 * @Description 审核通知单
	 * @CreateTime 2017年8月14日 上午10:24:08
	 * @CreateBy 裴秀
	 * @param model
	 * @return 
	 * @throws BusinessException
	 */
	@Privilege(code="quality:auditnotice:main")
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public ModelAndView main(Map<String, Object> model)throws BusinessException {
	 	model = new HashMap<String, Object>();
	    return new ModelAndView("/quality/creatingauditnotice/creating_audit_notice",model);
	
	}
	
	
	/**
	 * 
	 * @Description 查询审核单数据
	 * @CreateTime 2018-1-5 上午10:42:28
	 * @CreateBy 孙霁
	 * @param auditnotice
	 * @param request
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@ResponseBody
	@RequestMapping(value = "queryAll", method = RequestMethod.POST)
	public Map<String, Object> queryAll(@RequestBody Auditnotice auditnotice,HttpServletRequest request,Model model)throws BusinessException{
		try {
			return auditnoticeService.queryAll(auditnotice);
		} catch (Exception e) {
			throw new BusinessException("查询失败！", e);
		}
	}
	
	/**
	 * 
	 * @Description 添加审核单数据
	 * @CreateTime 2018-1-5 上午10:42:28
	 * @CreateBy 孙霁
	 * @param auditnotice
	 * @param request
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@Privilege(code="quality:auditnotice:main:01")
	@ResponseBody
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@RequestBody Auditnotice auditnotice,HttpServletRequest request,Model model)throws BusinessException{
		try {
			return auditnoticeService.insert(auditnotice);
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			throw new BusinessException("查询失败！",e);
		}
	}
	/**
	 * 
	 * @Description 修改审核单数据
	 * @CreateTime 2018-1-11 下午3:04:31
	 * @CreateBy 孙霁
	 * @param auditnotice
	 * @param request
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@Privilege(code="quality:auditnotice:main:02")
	@ResponseBody
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@RequestBody Auditnotice auditnotice,HttpServletRequest request,Model model)throws BusinessException{
		try {
			return auditnoticeService.update(auditnotice);
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			throw new BusinessException("查询失败！",e);
		}
	}
	/**
	 * 
	 * @Description 根据id查询审核单数据
	 * @CreateTime 2018-1-11 上午10:10:53
	 * @CreateBy 孙霁
	 * @param request
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	@ResponseBody
	@RequestMapping("selectById")
	public Map<String, Object> selectById(HttpServletRequest request, String id) throws BusinessException {
		try {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("auditnotice",  auditnoticeService.selectById(id));
			return resultMap;
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			throw new BusinessException("查询失败！",e);
		}
		
	}
	/**
	 * 
	 * @Description 删除
	 * @CreateTime 2018-1-11 上午10:10:53
	 * @CreateBy 孙霁
	 * @param request
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	@Privilege(code="quality:auditnotice:main:03")
	@ResponseBody
	@RequestMapping("delete")
	public void delete(HttpServletRequest request, String id) throws BusinessException {
		try {
			auditnoticeService.delete(id);
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			throw new BusinessException("操作失败！",e);
		}
		
	}
	/**
	 * 
	 * @Description 下发
	 * @CreateTime 2018-1-11 上午10:10:53
	 * @CreateBy 孙霁
	 * @param request
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	@Privilege(code="quality:auditnotice:main:04")
	@ResponseBody
	@RequestMapping("issue")
	public void issue(HttpServletRequest request, String id) throws BusinessException {
		try {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			auditnoticeService.updateIssue(id);
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			throw new BusinessException("操作失败！",e);
		}
		
	}
	/**
	 * 
	 * @Description 接收
	 * @CreateTime 2018-1-11 上午10:10:53
	 * @CreateBy 孙霁
	 * @param request
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	@Privilege(code="quality:auditnotice:main:05")
	@ResponseBody
	@RequestMapping("accept")
	public void accept(HttpServletRequest request, String id) throws BusinessException {
		try {
			auditnoticeService.updateAccept(id);
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			throw new BusinessException("操作失败！",e);
		}
		
	}
	/**
	 * 
	 * @Description 接收审核项目单
	 * @CreateTime 2018-1-11 上午10:10:53
	 * @CreateBy 孙霁
	 * @param request
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	@ResponseBody
	@RequestMapping("acceptAuditNotice")
	public void acceptAuditNotice(HttpServletRequest request, String id) throws BusinessException {
		try {
			auditnoticeService.updateacceptAuditNotice(id);
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			throw new BusinessException("操作失败！",e);
		}
		
	}
	/**
	 * 
	 * @Description 关闭
	 * @CreateTime 2018-1-11 上午10:10:53
	 * @CreateBy 孙霁
	 * @param request
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	@Privilege(code="quality:auditnotice:main:06")
	@ResponseBody
	@RequestMapping("close")
	public void close(HttpServletRequest request, String id) throws BusinessException {
		try {
			auditnoticeService.updateClose(id);
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			throw new BusinessException("操作失败！",e);
		}
		
	}
	/**
	 * 
	 * @Description 查看
	 * @CreateTime 2018-1-12 下午2:08:33
	 * @CreateBy 孙霁
	 * @param model
	 * @param fjzch
	 * @param dprtcode
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public ModelAndView view(Model model,@RequestParam String id)throws BusinessException {
			model.addAttribute("auditnoticeId", id);
			return new ModelAndView("/quality/creatingauditnotice/creating_audit_notice_view");
	}
	

}

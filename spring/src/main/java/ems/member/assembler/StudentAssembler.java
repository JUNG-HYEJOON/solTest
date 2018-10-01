package ems.member.assembler;

import ems.member.dao.StudentDao;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentDeleteService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

public class StudentAssembler {
	private StudentDao studentDao;
	private StudentRegisterService registerService;
	private StudentModifyService modifyService;
	private StudentDeleteService deleteService;
	private StudentSelectService selectService;
	private StudentAllSelectService allSelectService;
	
	public StudentAssembler() {
		studentDao=new StudentDao();
		registerService=new StudentRegisterService(studentDao);
		modifyService=new StudentModifyService(studentDao);
		deleteService=new StudentDeleteService(studentDao);
		selectService=new StudentSelectService(studentDao);
		allSelectService=new StudentAllSelectService(studentDao);
	}
	public StudentDao getStudentDao() {
		return this.studentDao;
		
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao=studentDao;
	}
	public StudentRegisterService getRegisterService() {
		return this.registerService;
	}
	public void setRegisterService(StudentRegisterService registerService) {
		this.registerService= registerService;
	}
	public StudentModifyService getModifyService () {
		return this.modifyService;
	}
	public void setModifyService(StudentModifyService modifyService) {
		this.modifyService = modifyService;
	}
	public StudentDeleteService getDeleteService() {
		return this.deleteService;
	}
	public void setdeleteService(StudentDeleteService deleteService) {
		this.deleteService=deleteService;
	}
	public StudentSelectService getSelectService() {
		return this.selectService;
	}
	public void setSelectService(StudentSelectService selectService) {
		this.selectService=selectService;
	}
	public StudentAllSelectService getAllSelectService() {
		return this.allSelectService;
	}
	public void SetAllSelectService(StudentAllSelectService allSelectService) {
		this.allSelectService =allSelectService;
	}

}

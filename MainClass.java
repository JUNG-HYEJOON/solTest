package ems.member.main;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ems.member.Student;
import ems.member.assembler.StudentAssembler;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sNums = { "001", "002", "003", "004", "005", "006", "007", "008", "009", "010" };
		String[] sIds = { "rabbit", "hippo", "raccoon", "elephant", "lion", "tiger", "pig", "horse", "bird", "deer" };
		String[] sPws = { "11111", "22222", "33333", "44444", "55555", "66666", "77777", "88888", "99999", "00000" };
		String[] sNames = { "홍길동", "개똥이", "소똥이", "정혜준", "이정훈", "이현정", "이유진", "이무신", "말똥이", "하정후" };
		int[] sAges = { 19, 22, 20, 27, 19, 21, 19, 25, 22, 24 };
		String[] sGenders = { "M", "W", "M", "W", "M", "W", "M", "W", "M", "W" };
		String[] sMajors= {"영문학과","국문학과","불문학과","철학과","사학과","법학과","통계학과","컴퓨터학과","경제학","정치학"};
		StudentAssembler assembler = new StudentAssembler();
		StudentRegisterService registerService=assembler.getRegisterService();
		for(int j =0; j< sNums.length;j++) {
			Student student = new Student(sNums[j], sIds[j],sPws[j], sNames[j],sAges[j],sGenders[j],sMajors[j]);
			registerService.register(student);
		}
		
		StudentModifyService modifyService=assembler.getModifyService();
		modifyService.modify(new Student("001","deer","0000","melissa",26,"W","Vocal Music"));
		
		StudentSelectService selectService=assembler.getSelectService();
		Student modifiedStudent = selectService.select("003");
		System.out.print("sNum:"+modifiedStudent.getsNum()+"\t");
		System.out.print("|sId:"+modifiedStudent.getsId()+"\t");
		System.out.print("|sPw:"+modifiedStudent.getsPw()+"\t");
		System.out.print("|sName:"+modifiedStudent.getsName()+"\t");
		System.out.print("|sAge:"+modifiedStudent.getsAge()+"\t");
		System.out.print("|sGender:"+modifiedStudent.getsGender()+"\t");
		System.out.print("|sMajor:"+modifiedStudent.getsMajor()+"\n\n");
		
		StudentAllSelectService allSelectService=assembler.getAllSelectService();
		Map<String, Student> allStudent = allSelectService.allSelect();
		Set<String> keys=allStudent.keySet();
		Iterator<String>iterator=keys.iterator();
		
		while(iterator.hasNext()) {
			String key=iterator.next();
			Student student =allStudent.get(key);
			System.out.print("snum:"+student.getsNum()+ "\t");
			System.out.print("|sId:"+student.getsId()+ "\t");
			System.out.print("|sPw:"+student.getsPw()+ "\t");
			System.out.print("|sName:"+student.getsName()+ "\t");
			System.out.print("|sAge:"+student.getsAge()+ "\t");
			System.out.print("|sGender:"+student.getsGender()+ "\t");
			System.out.print("|sMajor:"+student.getsMajor()+ "\n");
		}
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String str="";
			System.out.println("\n================================================================================================");
			System.out.println("Select number.");
			System.out.println("1. Checkstudent information");
			System.out.println("2. Exit");
			str = scanner.next();
			if(str.equals("2")) {
				System.out.println("Bye~~");
				break;
			}else { 
				System.out.println("plase input your class number.");
				str=scanner.next();
				Student student=selectService.select(str);		
				System.out.print("snum:"+student.getsNum()+ "\t");
				System.out.print("|sId:"+student.getsId()+ "\t");
				System.out.print("|sPw:"+student.getsId()+ "\t");
				System.out.print("|sName:"+student.getsId()+ "\t");
				System.out.print("|sAge:"+student.getsId()+ "\t");
				System.out.print("|sGender:"+student.getsId()+ "\t");
				System.out.println("|sMajor:"+student.getsId()+ "\t");
				
			}
		}
	}

}

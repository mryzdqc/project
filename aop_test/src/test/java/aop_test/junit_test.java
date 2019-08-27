package aop_test;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Type;
import model.Type2;
import model.TypeInterface;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:aa.xml"})
public class junit_test {
//	@Autowired
//	Type t;
//	@Resource(name="my")
//	Type2 t2;
	
//	@Inject
//	@Named ("my")
//	Type2 a11;
//	
//	@Test
//	public void ee() {
//		System.out.println(a11.getName());
//		//System.out.println(t2.getName());
//	}
	
//	@Resource(name="t")
//	//Type t;
//	TypeInterface t;
	
	@Autowired
	Type t;
	
	@Test
	public void ss(){
	//System.out.println(t.getName());
	System.out.println(t.getName());
	}
	
}

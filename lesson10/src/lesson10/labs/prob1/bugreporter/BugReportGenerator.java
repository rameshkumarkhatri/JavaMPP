package lesson10.labs.prob1.bugreporter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;
import java.util.stream.Collectors;

import lesson10.labs.prob1.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<String> names = new ArrayList<String>();

		HashMap<String, List<String>> map = new HashMap<>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				if(!map.containsKey(annotation.assignedTo())){
					map.put(annotation.assignedTo(), new ArrayList<>());
				}
				map.get(annotation.assignedTo()).add(getStringFromAnnotation(annotation,cl.getName()));
			}
		}

		System.out.println(names);

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("bug_report.txt", true));

			for(String key: map.keySet())
//				System.out.println(key+"\n"+map.get(key).stream().collect(Collectors.joining("\n")).toString());
				writer.append(key+"\n"+map.get(key).stream().collect(Collectors.joining("\n")).toString());
			writer.close();
		 } catch (IOException e) {
			e.printStackTrace();
		}


	}

	private String getStringFromAnnotation(BugReport annotation, String nameOfClass) {
		return "\t"+REPORTED_BY +annotation.reportedBy()+ "\n\t"
		+CLASS_NAME +nameOfClass+ "\n\t"
		+DESCRIPTION +annotation.description()+ "\n\t"
		+SEVERITY+annotation.severity()+ "\n\n";
	}


}

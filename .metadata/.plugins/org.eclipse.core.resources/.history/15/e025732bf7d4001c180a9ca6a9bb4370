package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	
	public static void generateJVMReport(String json) {
         
		File file=new File("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Cucumber\\target");
		Configuration config = new Configuration(file, "Fb Report");
		config.addClassifications("Platform", "windows-11");
		config.addClassifications("version", "100.02.1.50");
		List<String> li = new ArrayList<String>();
		li.add(json);
		ReportBuilder builder = new ReportBuilder(li, config);
		builder.generateReports();
	}
        
}

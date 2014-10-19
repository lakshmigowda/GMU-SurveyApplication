/*****************Lakshmi Venkataiah****************/

/* This class contains the Spring annotations for controller and request mapping methods. 
 * The methods are called based on the URL requested by users */
package lakshmi.swe645Assign1.controller;

import java.util.ArrayList;
import java.util.List;

import lakshmi.swe645Assign1.model.SurveyDataModel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Swe645Controller {

	@RequestMapping(value = "/studenthomepage", method = RequestMethod.GET)
	public ModelAndView handlerStudentHomePage() {
		ModelAndView modelView = new ModelAndView("studenthomepage");
		return modelView;
	}

	@RequestMapping(value = "/studentsurveypage")
	public ModelAndView handlerStudentSurveyPage() {
		ModelAndView modelView = new ModelAndView("studentsurveypage");
		SurveyDataModel studentSurveyData = new SurveyDataModel();
		modelView.addObject("surveyresult", studentSurveyData);

		List<String> likingvalues = new ArrayList<String>();
		likingvalues.add("Students");
		likingvalues.add("Location");
		likingvalues.add("Campus");
		likingvalues.add("Atmosphere");
		likingvalues.add("Dorm Rooms");
		likingvalues.add("Sports");
		modelView.addObject("likingvalues", likingvalues);

		return modelView;
	}

}

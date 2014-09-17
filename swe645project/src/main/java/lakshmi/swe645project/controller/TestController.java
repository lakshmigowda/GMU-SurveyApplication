package lakshmi.swe645project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lakshmi.swe645project.model.SurveyDataModel;
import lakshmi.swe645project.model.TestModel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value = "/testwelcome")
	public ModelAndView handlerWelcomeRequest() {
		ModelAndView modelView = new ModelAndView("testwelcome");
		TestModel testModel = new TestModel();
		modelView.addObject("padma", testModel);
		return modelView;
	}

	@RequestMapping(value = "/testsubmit")
	public ModelAndView handlerTestSubmitRequest(
			@ModelAttribute TestModel testModel) {
		ModelAndView modelView = new ModelAndView("testsubmitresult");
		modelView.addObject("testname", testModel.getTestName());
		return modelView;
	}

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
		likingvalues.add("Friends");
		likingvalues.add("Television");
		likingvalues.add("Internet");
		likingvalues.add("Other");
		modelView.addObject("likingvalues", likingvalues);

		return modelView;
	}

}

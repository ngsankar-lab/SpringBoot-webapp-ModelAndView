# SpringBoot-webapp-ModelAndView
Spring boot webapp with ModelAndView

What is it?
----------
ModelAndView is used to add data and view name.

Usage from old style to ModelAndView
----------------------------------------
1)
HttpServletRequest is used in method parameter to get hold on request object
public String home(HttpServletRequest req)

String name=req.getParameter("name") //If the browser/client request with ?name="Dhruv"

get the session from request object like below
HttpSession session=req.getSession();

set the session attrubute, so that we can fetch from jsp.
session.setAttribute("name", name);

2)
public String Home(String name, HttpSession session)

session.setAttribute("name", name);
return "Home" //Provided you have added prefix and suffix keys to application.properties file

3)
Use ModelAndView to set "name" and return "Home"

public ModelAndView(String name)
ModelAndView mv=new ModelAndView()
mv.setObject("name",name)
mv.setViewName("Home") //added prefix and suffix to the .properties file
return mv

Annotations:
------------
@RequestParam("name")
This will enable to use it inside method parameter, So that we can refer the request parameter that is used at client like below

public ModelAndView Home(@RequestParam("name") String myName)
mv.addObject("name",myName)



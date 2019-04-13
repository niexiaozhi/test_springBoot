// package com.nxz.err;
//
// import java.util.HashMap;
// import java.util.Map;
//
// import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.ResponseBody;
//
/// **
// * 全局捕获异常
// * @author Administrator
// * 1.捕获异常后返回json格式数据
// * 2.捕获异常后返回跳转的页面
// */
// @ControllerAdvice(basePackages = "com.nxz.controller") //扫描包
// public class Error {
//
// //@ResponseBody 表示返回json格式
// //modeAndView 返回页面
// @ExceptionHandler(RuntimeException.class) //拦截运行时异常
// @ResponseBody
// public Map<String,Object> errorResult(){
// Map<String,Object> map = new HashMap<String,Object>();
//
// map.put("errorCode", 500);
// map.put("errorMsg", "全局捕获异常：服务器系统错误");
//
// return map;
// }
//
// }

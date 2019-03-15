<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- saved from url=(0051)http://localhost:8080/shop-admin/manage/user/logout -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <script>
        var basepath = "/shop-admin";
        var staticpath = "/shop-admin/resource";
        var imageRootPath = "http://localhost:8080/shop-admin/";
        var non_responsive2 = "n";
        var systemCode = "图灵学院双十一电商平台"
        var login = false;
        var currentUser = "";
    </script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="图灵学院双十一电商平台">
    <meta name="keywords" content="图灵学院双十一电商平台">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>图灵学院双十一电商平台 - JAVA开源电商系统</title>
    <link rel="shortcut icon" type="image/x-icon" href="http://localhost:8080/jshop/resource/images/favicon.png">

    <link rel="stylesheet" href="/zTreeStyle.css" type="text/css">
    <link rel="stylesheet" href="/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="/jquery-ui.css">
    <link rel="stylesheet" href="/jquery.validator.css">

    <script type="text/javascript" src="/jquery-1.9.1.min.js.下载"></script>
    <script type="text/javascript" src="/jquery.ztree.all-3.5.min.js.下载"></script>

    <script type="text/javascript" src="/jquery.blockUI.js.下载"></script>
    <script type="text/javascript" src="/bootstrap.min.js.下载"></script>
    <!-- sb admin -->
    <link rel="stylesheet" href="/sb-admin-2.css">
    <script src="/sb-admin-2.js.下载"></script>

    <link href="/font-awesome.min.css" rel="stylesheet" type="text/css">

    <script src="/jquery-ui.js.下载"></script>
    <!-- jquery validator -->

    <script type="text/javascript" src="/jquery.validator.js.下载"></script>
    <script type="text/javascript" src="/zh_CN.js.下载"></script>

    <script type="text/javascript" src="/WdatePicker.js.下载"></script><link href="/WdatePicker.css" rel="stylesheet" type="text/css">

    <link rel="stylesheet" href="/default.css">
    <script charset="utf-8" src="/kindeditor-min.js.下载"></script>
    <script charset="utf-8" src="/zh_CN.js(1).下载"></script>

    <!-- datatables -->
    <link rel="stylesheet" href="/jquery.dataTables.css">
    <script charset="utf-8" src="/jquery.dataTables.js.下载"></script>
    <link rel="stylesheet" href="/dataTables.bootstrap.css">
    <script charset="utf-8" src="/dataTables.bootstrap.js.下载"></script>

    <!-- metisMenu -->
    <link href="/metisMenu.min.css" rel="stylesheet">
    <script src="/metisMenu.min.js.下载"></script>
    <script type="text/javascript" src="/manage.js.下载"></script>

        <script src="/login.js.下载"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-success">
                <div class="panel-heading">
                    <h3 class="panel-title"><b>图灵学院双十一电商平台</b>-后台管理</h3>
                </div>
                <div class="panel-body">
                    <form role="form" id="formLogin1" action="/power/login" method="post">
                        <fieldset>
                            <div class="form-group">
                            </div>
                            <div class="form-group has-success">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class="fa fa-user fa-fw"></span>
                                    </span>
                                    <input type="text" value="zhang12345" placeholder="账号" name="accName" class="len form-control" id="username" autofocus="">
                                </div>
                            </div>
                            <div class="form-group has-success">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class="fa fa-key fa-fw"></span>
                                    </span>
                                    <input type="password" name="accPassword" placeholder="密码" class="len form-control" label="密码">
                                </div>
                            </div>
                            <div class="form-group has-success">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class="fa fa-key fa-fw"></span>
                                    </span>
                                    <input type="text" name="verifyCode" placeholder="验证码" class="len form-control" label="验证码">
                                </div>
                            </div>
                            <div class="row help-block">
                                <div class="col-md-offset-1 col-md-11">
                                    <span class="fa fa-info-circle"></span>默认用户名密码:zhang../abc...<br/>
                                    <input type='button' value='刷新插件' onclick="toRefreshPlugins()"/>
                                </div>
                            </div>
                            <div class="row help-block" >
                                <div class="col-md-offset-1 col-md-11" >
                                    <div id="managePluginsDiv"></div>
                                </div>
                            </div>
                            <input type="submit" id="btnLogin" class="btn btn-lg btn-success btn-block" value="登录">
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script type='text/javascript'>
   $(document).ready(function(){
	   refreshManagePluginDiv('/plugin/init');
	   
	   <c:if test="${!empty message}">
	      alert('${message}');
	   </c:if>
   });
   function toRefreshPlugins(){
	   $.ajax({
		   type:'post',
		   url:'/plugin/updatePlugins',
		   success:function(msg){
			   refreshManagePluginDiv('/plugin/init');
		   }
	   });
   }
   function refreshManagePluginDiv(_url){
	   if(!_url){
		   _url = '/plugin/view';
	   }
	   $.ajax({
		   type:'post',
		   url:_url,
		   success:function(message){
			   $("#managePluginsDiv").html(message);
		   }
	   });
   }
   function changeStatus(_id){
	   var _url = "/plugin/active";
	   var _check = $("#"+_id);
	   if(_check.attr('checked')){
		   _url = "/plugin/disable";
	   }
	   var _data = "plgId="+ _check.val();
	   $.ajax({
		   type:'post',
		   url:_url,
		   data:_data,
		   success:function(result){
			   refreshManagePluginDiv();
		   }
	   });
   }
   
</script>


<div id="_my97DP" style="position: absolute; top: -1970px; left: -1970px;"><iframe style="width: 186px; height: 195px;" src="/My97DatePicker.html" frameborder="0" border="0" scrolling="no"></iframe></div></body></html>

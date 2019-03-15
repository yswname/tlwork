<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0049)http://localhost:8080/shop-admin/manage/user/home -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <script>
        var basepath = "/shop-admin";
        var staticpath = "/shop-admin/resource";
        var imageRootPath = "http://localhost:8080/shop-admin/";
        var non_responsive2 = "n";
        var systemCode = "图灵学院双十一电商平台"
            var login = true;
        var currentUser = "admin";
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

</head>
<body>
    <div id="wrapper">
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="http://localhost:8080/shop-admin/manage/user/home">图灵学院 --- 双十一电商后台管理系统</a>
            </div>
            <!-- /.navbar-header -->
               <!-- /.navbar-collapse -->
            <ul class="nav navbar-top-links navbar-right">
                 <li><a href="http://localhost:8080/shop-web" target="_blank"><i class="glyphicon glyphicon-globe"></i> 访问站点</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="http://localhost:8080/shop-admin/manage/user/home#">
                        <i class="fa fa-user fa-fw"></i> 超级管理员 <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="http://localhost:8080/shop-admin/manage/user/show?account=admin" target="_blank"><i class="fa fa-user fa-fw"></i> 用户信息</a>
                        </li>
                        <li><a href="http://localhost:8080/shop-admin/manage/user/toChangePwd"><i class="fa fa-gear fa-fw"></i> 修改密码</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="http://localhost:8080/shop-admin/manage/user/logout"><i class="fa fa-sign-out fa-fw"></i> 注销</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
<script>
    $(function(){
        $('#side-menu').metisMenu();
        $("a.menu-item").each(function(){
            var href = $(this).data("href");
            $(this).attr("href", href==""?"#":basepath + href);
        })
        var parent = $("a.menu-item.active").parent().parent();
        if(parent.is("ul.nav")){
            parent.addClass("in").parent().addClass("active");
        }
    });
</script>
<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse active">
        <!-- /.navbar-top-links -->
        <ul class="nav in" id="side-menu">
            <li class="sidebar-search" style="margin-top: 10px;">
                <!-- /input-group -->
            </li>
                    <li>
                        <a id="item_0_57" data-href="/manage/user/initManageIndex" class="menu-item active" href="http://localhost:8080/shop-admin/manage/user/initManageIndex"><i class="fa fa-folder fa-fw"></i> 首页</a>
                    </li>
                    <li>
                        <a id="item_0_11" data-href="" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/home#"><i class="fa fa-folder fa-fw"></i> 商品管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse">
                                <li>
                                    <a id="item_11_65" data-href="/manage/catalog/selectList?init=y&amp;type=p" class="menu-item " href="http://localhost:8080/shop-admin/manage/catalog/selectList?init=y&amp;type=p"><i class="fa fa-files-o fa-fw"></i> 商品目录</a>
                                </li>
                                <li>
                                    <a id="item_11_14" data-href="/manage/product/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/product/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 商品管理</a>
                                </li>
                                <li>
                                    <a id="item_11_64" data-href="/manage/attribute/selectList?init=y&amp;pid=0" class="menu-item " href="http://localhost:8080/shop-admin/manage/attribute/selectList?init=y&amp;pid=0"><i class="fa fa-files-o fa-fw"></i> 商品属性</a>
                                </li>
                                <li>
                                    <a id="item_11_66" data-href="/manage/attribute/selectList?init=y&amp;pid=-1" class="menu-item " href="http://localhost:8080/shop-admin/manage/attribute/selectList?init=y&amp;pid=-1"><i class="fa fa-files-o fa-fw"></i> 商品参数</a>
                                </li>
                                <li>
                                    <a id="item_11_93" data-href="/manage/gift/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/gift/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 赠品管理</a>
                                </li>
                                <li>
                                    <a id="item_11_86" data-href="/manage/emailNotifyProduct/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/emailNotifyProduct/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 到货通知</a>
                                </li>
                            </ul>
                    </li>
                    <li>
                        <a id="item_0_18" data-href="" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/home#"><i class="fa fa-folder fa-fw"></i> 订单管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse">
                                <li>
                                    <a id="item_18_19" data-href="/manage/order/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/order/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 订单管理</a>
                                </li>
                                <li>
                                    <a id="item_18_84" data-href="/manage/order/selectList?init=y&amp;refundStatus=WAIT_SELLER_AGREE" class="menu-item " href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;refundStatus=WAIT_SELLER_AGREE"><i class="fa fa-files-o fa-fw"></i> 退款管理</a>
                                </li>
                                <li>
                                    <a id="item_18_85" data-href="/manage/order/selectList?init=y&amp;refundStatus=WAIT_SELLER_CONFIRM_GOODS" class="menu-item " href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;refundStatus=WAIT_SELLER_CONFIRM_GOODS"><i class="fa fa-files-o fa-fw"></i> 退货管理</a>
                                </li>
                            </ul>
                    </li>
                    <li>
                        <a id="item_0_23" data-href="" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/home#"><i class="fa fa-folder fa-fw"></i> 会员管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse">
                                <li>
                                    <a id="item_23_90" data-href="/manage/accountRank/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/accountRank/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 等级管理</a>
                                </li>
                                <li>
                                    <a id="item_23_24" data-href="/manage/account/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/account/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 会员管理</a>
                                </li>
                                <li>
                                    <a id="item_23_46" data-href="/manage/comment/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/comment/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 评论管理</a>
                                </li>
                            </ul>
                    </li>
                    <li>
                        <a id="item_0_6" data-href="" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/home#"><i class="fa fa-folder fa-fw"></i> 内容管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse">
                                <li>
                                    <a id="item_6_43" data-href="/manage/catalog/selectList?init=y&amp;type=a" class="menu-item " href="http://localhost:8080/shop-admin/manage/catalog/selectList?init=y&amp;type=a"><i class="fa fa-files-o fa-fw"></i> 文章分类</a>
                                </li>
                                <li>
                                    <a id="item_6_71" data-href="/manage/news/selectList?init=y&amp;type=notice" class="menu-item " href="http://localhost:8080/shop-admin/manage/news/selectList?init=y&amp;type=notice"><i class="fa fa-files-o fa-fw"></i> 公告管理</a>
                                </li>
                                <li>
                                    <a id="item_6_7" data-href="/manage/news/selectList?init=y&amp;type=help" class="menu-item " href="http://localhost:8080/shop-admin/manage/news/selectList?init=y&amp;type=help"><i class="fa fa-files-o fa-fw"></i> 文章管理</a>
                                </li>
                                <li>
                                    <a id="item_6_45" data-href="/manage/navigation/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/navigation/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 友情链接</a>
                                </li>
                                <li>
                                    <a id="item_6_9" data-href="/manage/indexImg/selectList" class="menu-item " href="http://localhost:8080/shop-admin/manage/indexImg/selectList"><i class="fa fa-files-o fa-fw"></i> 门户滚动图片</a>
                                </li>
                                <li>
                                    <a id="item_6_40" data-href="/manage/advert/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/advert/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 广告管理</a>
                                </li>
                                <li>
                                    <a id="item_6_87" data-href="/manage/notifyTemplate/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/notifyTemplate/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 通知模板管理</a>
                                </li>
                                <li>
                                    <a id="item_6_88" data-href="/manage/email/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/email/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 发送邮件列表</a>
                                </li>
                                <li>
                                    <a id="item_6_94" data-href="/manage/hotquery/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/hotquery/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 热门查询管理</a>
                                </li>
                            </ul>
                    </li>
                    <li>
                        <a id="item_0_32" data-href="" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/home#"><i class="fa fa-folder fa-fw"></i> 报表统计<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse">
                                <li>
                                    <a id="item_32_34" data-href="/manage/report/orderSales?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/report/orderSales?init=y"><i class="fa fa-files-o fa-fw"></i> 订单销售统计</a>
                                </li>
                                <li>
                                    <a id="item_32_35" data-href="/manage/report/productSales?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/report/productSales?init=y"><i class="fa fa-files-o fa-fw"></i> 商品销售统计</a>
                                </li>
                            </ul>
                    </li>
                    <li>
                        <a id="item_0_80" data-href="" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/home#"><i class="fa fa-folder fa-fw"></i> 第三方插件<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse">
                                <li>
                                    <a id="item_80_81" data-href="/manage/pay/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/pay/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 支付管理</a>
                                </li>
                                <li>
                                    <a id="item_80_82" data-href="/manage/oss/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/oss/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 存储插件管理</a>
                                </li>
                                <li>
                                    <a id="item_80_83" data-href="/manage/commentType/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/commentType/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 评论插件管理</a>
                                </li>
                            </ul>
                    </li>
                    <li>
                        <a id="item_0_91" data-href="" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/home#"><i class="fa fa-folder fa-fw"></i> 活动管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse">
                                <li>
                                    <a id="item_91_92" data-href="/manage/activity/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/activity/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 商品促销</a>
                                </li>
                            </ul>
                    </li>
                    <li>
                        <a id="item_0_1" data-href="" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/home#"><i class="fa fa-folder fa-fw"></i> 系统管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level collapse">
                                <li>
                                    <a id="item_1_3" data-href="/manage/user/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 用户管理</a>
                                </li>
                                <li>
                                    <a id="item_1_4" data-href="/manage/role/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/role/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 角色管理</a>
                                </li>
                                <li>
                                    <a id="item_1_2" data-href="/manage/menu/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/menu/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 资源管理</a>
                                </li>
                                <li>
                                    <a id="item_1_5" data-href="/manage/user/toChangePwd" class="menu-item " href="http://localhost:8080/shop-admin/manage/user/toChangePwd"><i class="fa fa-files-o fa-fw"></i> 修改密码</a>
                                </li>
                                <li>
                                    <a id="item_1_48" data-href="/manage/area/areaTree" class="menu-item " href="http://localhost:8080/shop-admin/manage/area/areaTree"><i class="fa fa-files-o fa-fw"></i> 区域管理</a>
                                </li>
                                <li>
                                    <a id="item_1_38" data-href="/manage/express/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/express/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 配送方式</a>
                                </li>
                                <li>
                                    <a id="item_1_36" data-href="/manage/systemlog/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/systemlog/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 日志管理</a>
                                </li>
                                <li>
                                    <a id="item_1_49" data-href="/manage/systemSetting/toEdit?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/systemSetting/toEdit?init=y"><i class="fa fa-files-o fa-fw"></i> 系统设置</a>
                                </li>
                                <li>
                                    <a id="item_1_51" data-href="/manage/keyvalue/selectList?init=y" class="menu-item " href="http://localhost:8080/shop-admin/manage/keyvalue/selectList?init=y"><i class="fa fa-files-o fa-fw"></i> 键值对管理</a>
                                </li>
                                <li>
                                    <a id="item_1_69" data-href="/manage/cache/cache.jsp" class="menu-item " href="http://localhost:8080/shop-admin/manage/cache/cache.jsp"><i class="fa fa-files-o fa-fw"></i> 缓存管理</a>
                                </li>
                            </ul>
                    </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper" style="min-height: 583px;">

            <div class="row">
                <div class="col-lg-12">
                    <div class="navbar navbar-default">
                        <ol class="breadcrumb bootstrap-admin-breadcrumb">
                            <li>
                                <a href="http://localhost:8080/shop-admin/manage/user/home">首页</a>
                            </li>
                            <li class="active">首页</li>
                        </ol>
                    </div>
                </div>
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                </div>
                <div class="col-lg-12">
<style>
    /*a:link {text-decoration:underline;}*/
    /*a:visited {text-decoration:underline;}*/
    /*a:hover {text-decoration:underline;}*/
    /*a:active {text-decoration:underline;}*/

    .font-focus{
        font-weight: 700;font-size: 16px;color: #f50 !important;text-decoration: underline;
    }
</style>
<script>
    $(function() {
        $( "#tabs" ).tabs({
            //event: "mouseover"
        });
    });
</script>
        <div id="tabs" class="ui-tabs ui-widget ui-widget-content ui-corner-all">
            <ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                <li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-1" aria-labelledby="ui-id-1" aria-selected="true" aria-expanded="true"><a href="http://localhost:8080/shop-admin/manage/user/home#tabs-1" style="font-size: 14px;" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-1">十万火急</a>
                    <!-- 						<a href="#"> -->
                    <!-- 						</a> -->
                </li>
                <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-2" aria-labelledby="ui-id-2" aria-selected="false" aria-expanded="false"><a href="http://localhost:8080/shop-admin/manage/user/home#tabs-2" style="font-size: 14px;" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-2">基本设置</a></li>
                <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-3" aria-labelledby="ui-id-3" aria-selected="false" aria-expanded="false"><a href="http://localhost:8080/shop-admin/manage/user/home#tabs-3" style="font-size: 14px;" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-3">图片设置</a></li>
                <!-- 					<li><a href="#tabs-4">新增订单</a></li> -->
                <!-- 					<li><a href="#tabs-5">最近销售状况</a></li> -->
            </ul>
            <div id="tabs-1" aria-labelledby="ui-id-1" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="false">
                <div class="alert alert-success" style="margin-bottom: 2px;text-align: left;">
                    <span class="badge badge-important">重要</span>&nbsp;<strong>主公，订单汇总如下：</strong>
                </div>
                <table class="table table-bordered">
                    <tbody><tr>
                        <td>未付款订单数：<a class="font-focus" href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;paystatus=n&amp;status=init">599</a></td>
                        <td>已付款，但未审核订单数：<a class="font-focus" style="color: #f50;" href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;paystatus=y&amp;status=init">5</a></td>
                    </tr>
                    <tr>
                        <td>已取消订单数：<a class="font-focus" href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;status=cancel">19</a></td>
                        <td>等待发货订单数：<a class="font-focus" style="color: #f50;" href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;paystatus=y&amp;status=pass">3</a></td>
                    </tr>
                </tbody></table>

                <div class="alert alert-info" style="margin-bottom: 2px;text-align: left;">
                    <strong><span class="badge badge-important">重要</span>&nbsp;主公，退款订单汇总如下：</strong>
                </div>
                <table class="table table-bordered">
                    <tbody><tr>
                        <td>【卖家需立即处理】退款协议等待卖家确认中：
                            <a class="font-focus" href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;refundStatus=WAIT_SELLER_AGREE">0</a>
                        </td>
                    </tr>
                    <tr>
                        <td>【卖家需立即处理】等待卖家收货：
                            <a class="font-focus" href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;refundStatus=WAIT_SELLER_CONFIRM_GOODS">0</a>
                        </td>
                    </tr>

                    <tr>
                        <td>【等待买家处理完】卖家不同意协议，等待买家修改：
                            <a class="font-focus" href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;refundStatus=SELLER_REFUSE_BUYER">0</a>
                        </td>
                    </tr>
                    <tr>
                        <td>【等待买家处理完】退款协议达成，等待买家退货：
                            <a class="font-focus" href="http://localhost:8080/shop-admin/manage/order/selectList?init=y&amp;refundStatus=WAIT_BUYER_RETURN_GOODS">0</a>
                        </td>
                    </tr>
                </tbody></table>

                <div class="alert alert-warning" style="margin-bottom: 2px;text-align: left;">
                    <strong><span class="badge badge-info">关注</span>&nbsp;主公，吐槽和缺货也是要关注一下子的啊：</strong>
                </div>
                <table class="table table-bordered">
                    <tbody><tr>
                        <td>缺货商品数：<a class="font-focus" href="http://localhost:8080/shop-admin/manage/product/selectList?init=y&amp;selectOutOfStockProduct=true">1</a></td>
                        <td>未回复的吐槽评论数：<a class="font-focus" href="http://localhost:8080/shop-admin/manage/comment/selectList?init=y&amp;selectCommentFromIndex=true">3</a></td>
                    </tr>
                </tbody></table>
            </div>
            <div id="tabs-2" aria-labelledby="ui-id-2" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="true" style="display: none;">
                <table class="table table-condensed">
                    <tbody><tr>
                        <td style="text-align: right;">系统版本:</td>
                        <td style="text-align: left;">系统版本号:1.1.0.0000.bate.</td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">系统代号:</td>
                        <td style="text-align: left;">图灵学院双十一电商平台</td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">名称:</td>
                        <td style="text-align: left;">图灵学院双十一电商平台</td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">简介:</td>
                        <td style="text-align: left;">http://localhost:8080/shop-web</td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">log:</td>
                        <td style="text-align: left;">http://localhost:8080/shop-web/resource/images/letter.gif</td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">网站标题:</td>
                        <td style="text-align: left;">图灵学院双十一电商平台</td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">description:</td>
                        <td style="text-align: left;">
                        图灵学院双十一电商平台
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">keywords:</td>
                        <td style="text-align: left;">
                        图灵学院双十一电商平台
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">shortcuticon:</td>
                        <td style="text-align: left;">
                        http://localhost:8080/jshop/resource/images/favicon.png
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">联系地址:</td>
                        <td style="text-align: left;">
                        湖南省长沙市岳麓区企业广场
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">联系电话:</td>
                        <td style="text-align: left;">
                        400-666-8888
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">邮箱:</td>
                        <td style="text-align: left;">
                        245553999@qq.com
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">备案号:</td>
                        <td style="text-align: left;">
                        ©京ICP备1302819号
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">是否开放网站:</td>
                        <td style="text-align: left;">
                            <input type="checkbox" disabled="disabled" checked="true" value="true">
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">关闭信息:</td>
                        <td style="text-align: left;">
                        网站维护中 图灵学院 http://tuling.ke.qq.com
                        </td>
                    </tr>
                </tbody></table>
            </div>
            <div id="tabs-3" aria-labelledby="ui-id-3" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="true" style="display: none;">
                <table class="table table-condensed">
                    <tbody><tr>
                        <td style="text-align: right;">图片根路径</td>
                        <td style="text-align: left;">http://localhost:8080/shop-admin/</td>
                    </tr>
                </tbody></table>
            </div>
        </div>
        <!-- tab end -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->



<div id="_my97DP" style="position: absolute; top: -1970px; left: -1970px;"><iframe style="width: 186px; height: 195px;" src="/My97DatePicker.html" frameborder="0" border="0" scrolling="no"></iframe></div></body></html>
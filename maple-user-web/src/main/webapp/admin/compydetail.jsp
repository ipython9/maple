<%--
  Created by IntelliJ IDEA.
  User: 43530
  Date: 2019/3/27
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="rootpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>

<head>
    <meta charset="utf-8">
    <title>maple直聘-互联网招聘神器！</title>
    <link href="../css/main.css" type="text/css" rel="stylesheet">
    <link href="../css/job.css" type="text/css" rel="stylesheet">
    <link href="../css/compy.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="../js/layui/css/layui.css" media="all">
</head>
<body class="home-body promotion-five zhipin-v2">
<!--<img src="images/homg-demo-bg.jpg" style="display: block; display: none; position: absolute; z-index: 9999; top:49px; opacity: 0.8; left: 50%; transform: translateX(-50%)" alt="">-->
<div id="wrap">
    <div id="header">
        <div class="inner home-inner">
            <div class="logo">
                <a href="https://www.zhipin.com/" ka="header-home-logo" title="BOSS直聘"><span>BOSS直聘</span></a>
            </div>
            <div class="nav">
                <ul>
                    <li class=""><a ka="header-home" href="${rootpath}/admin/index.html">首页</a></li>

                    <li class=""><a ka="header-job" href="${rootpath}/admin/searchjob.html">职位</a></li>
                    <li class="cur"><a ka="header_brand" href="${rootpath}/admin/searchjob.html">公司</a></li>

                </ul>
            </div>
            <div class="user-nav">
                <ul>
                    <li class="nav-figure">
                        <a href="https://www.zhipin.com/geek/new/index/recommend" ka="header-username">
                            <span class="label-text">${user.username}</span><img src="${user.picpath}" alt="">
                        </a>
                        <div class="dropdown"  style="display: none;">
                            <a href="https://www.zhipin.com/geek/new/index/recommend" ka="header-personal">个人中心<span>推荐职位、编辑微简历</span></a>
                            <a href="https://www.zhipin.com/geek/account/management" ka="account_manage">账号设置<span>修改密码、打招呼语和常用语</span></a>
                            <a href="https://www.zhipin.com/geek/account/management?type=2" ka="privacy_set">隐私设置</a>
                            <a href="https://www.zhipin.com/geek/item/mall.html" class="link-mall" ka="recruit_assistant">求职助手</a>
                            <a href="javascript:;" class="link-recruit" ka="header-recruit">切换为招聘者</a>
                            <a href="https://www.zhipin.com/logout/" class="link-logout" ka="header-logout">退出登录</a>
                            <p class="recruit-tip" style="display: none;"><img src="https://static.zhipin.com/v2/web/geek/images/recruit-tip.gif" alt=""><span>在 APP 端“我的 - 设置”中切换为Boss身份后，刷新本页面即可进行招聘</span></p>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <br>

    <div style="margin: 0 auto;width: 1200px;">
        <div>


            <div class="company-banner" style="">
                <div class="inner home-inner">
                    <div>
                        <div class="company-stat">
                            <span><a href="/gongsir/5e139930da054b4233R43w~~.html" ka="all-jobs-top"><b>${busModel.jobcount}</b>在招职位</a></span><em class="vline"></em><span><b>${busModel.hrcount}</b>位BOSS</span>
                        </div>
                        <div class="info-primary">
                            <img src="${busModel.picpath}" alt="" class="fl">
                            <div class="info">
                                <h1 class="name">${busModel.compyname}<i class="icon-brand"></i></h1>
                                <p>${busModel.random1}<em class="dolt"></em>10000人以上<em class="dolt"></em>${busModel.industayid}</p>

                            </div>
                        </div>
                    </div>


                    <!--
                        <div class="company-tab">
                                <a href="/gongsi/5e139930da054b4233R43w~~.html" ka="company-intro" class="cur">公司简介</a>
                            <a href="/gongsir/5e139930da054b4233R43w~~.html" ka="company-jobs" class="">招聘职位(9656)</a>
                        </div> -->

                </div>
            </div>
        </div>



        <!-- 行业开始 -->
        <div>
            <div class="layui-tab">
                <ul class="layui-tab-title">
                    <li class="layui-this">公司简介</li>
                    <li>热招职位</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show">
                        <div class="job-detail">
                            <div class="detail-content">
                                <div class="job-sec">
                                    <h3>${busModel.compyname}简介</h3>
                                    <div class="text fold-text" style="max-height: none; overflow: visible;"> ${busModel.intoduction}
                                <div class="job-sec company-products">
                                    <h3>产品介绍</h3>
                                    <ul>
                                        <c:forEach items="${busModel.producs}" var="produ">
                                        <li>
                                            <div class="figure">
                                                <img src="${produ.produpic}" alt="">
                                            </div>
                                            <div class="text">
                                                <div class="name">
                                                    <a href="${produ.produurl}" target="_blank" ka="production-1" content="nofollow">
                                                            ${produ.produname}<em class="vline"></em>${produ.producontent}
                                                    </a>
                                                </div>
                                                <p style="display: none;">一张身份证即可授信额度线上办理</p>
                                                <p class="gray"></p>
                                            </div>
                                        </li>
                                        </c:forEach>

                                    </ul>
                                </div>
                                <div class="job-sec company-business">
                                    <h3>工商信息</h3>
                                    <h4><span>来源：企查查</span>平安普惠投资咨询有限公司深圳侨香路营业部</h4>
                                    <div class="business-detail show-business-all" style="height: 46px;">
                                        <label><span></span><i class="fz fz-slideup"></i></label>
                                        <ul>
                                            <li><span class="t">法人代表：</span>傅正茂</li>
                                            <li><span class="t">注册资本：</span></li>
                                            <li><span class="t">成立时间：</span>2016-09-14</li>
                                            <li class="col-auto"><span class="t">企业类型：</span>有限责任公司分公司</li>
                                            <li class="col-auto"><span class="t">经营状态：</span>存续（在营、开业、在册）</li>
                                            <li class="col-auto"><span class="t">注册地址：</span>深圳市南山区沙河街道侨香路4068号智慧广场B栋401</li>
                                            <li class="col-auto"><span class="t">统一信用代码：</span>91440300MA5DL1478T</li>
                                            <li class="col-auto"><span class="t">经营范围：</span>投资咨询、财务咨询、商务信息咨询、企业管理咨询、经济信息咨询,市场营销策划、企业形象策划;技术咨询;受托对信贷逾期户及信用卡透支户进行提醒、通知服务。（法律、行政法规、国务院决定禁止的项目除外,限制的项目须取得许可后方可经营）^</li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="job-sec">
                                    <h3>公司地址</h3>
                                    <div class="job-location">
                                        <div class="location-item show-map">
                                            <div class="location-address"><a href="javascript:;" class="more-view" ka="job-poi-1"><i class="fz fz-slidedown"></i></a>${busModel.regaddress}</div>
                                        </div>

                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                        </div>
                    </div>
                    <div class="layui-tab-item">



                        <!-- 职位循环 -->
                        <div class="job-list">
                            <ul>
                            <c:forEach items="${jobs}" var="item" >
                                <li>
                                    <a href="/user/jobdetail.do?id=${item.job.id}" data-lid="7e531a49-a8ec-470e-99c2-0eecd670f7d9.brand_jod_list" data-jid="8a05253e358c6fb31Hd43Nu6EFI~" ka="comp_joblist_1" target="_blank">
                                        <div class="job-primary">
                                            <div class="info-primary">
                                                <h3 class="name">
                                                    <div class="title-box">
                                                        <div class="job-title">${item.job.name}</div>
                                                        <span class="red">${item.job.startpd}-${item.job.endpd}</span>
                                                    </div>
                                                    <div class="info-detail" style="top: 0px;"></div>
                                                </h3>
                                                <p>${item.job.city}<em class="vline"></em>${item.job.exp}<em class="vline"></em>${item.job.level}</p>
                                            </div>
                                            <div class="info-publis">
                                                <h3 class="name">
                                                    <img src="${item.user.picpath}">
                                                        ${item.user.username}<em class="vline"></em>招聘专员
                                                </h3>
                                                <p>${item.job.creatine}</p>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                            </c:forEach>
                            </ul>
                            <div class="page">
                                分页
                            </div>
                        </div>

                        <!-- 职位循环结束 -->




                    </div>
                </div>
            </div>
        </div>
        <!-- 行业结束 -->
    </div>




</div>















<div id="footer">
    <div class="inner home-inner">
        <div class="footer-social">
            <img src="https://static.zhipin.com/zhipin/v138/web/geek/images/footer-logo.png" alt="">
            <p>企业服务热线和举报投诉 <span>400 065 5799</span></p>
            <p>工作日 <span>8:00 - 22:00</span></p>
            <p>休息日 <span>9:30 - 18:30</span></p>
            <p class="footer-icon">
                <a href="http://www.weibo.com/bosszhipin" ka="link-weibo" target="_blank" ka="cpc-footer-weibo" class="icon-weibo"><span>官方微博</span></a>
                <a href="javascript:;" class="icon-weixin" ka="link-weixin"><span>微信公众号</span><img src="https://static.zhipin.com/v2/web/geek/images/we_chat_qr.jpg" class="qrcode-weixin" /></a>
                <a href="https://app.zhipin.com" class="icon-app" ka="link-downloadapp"><span>下载</span></a>
            </p>
        </div>
        <div class="footer-about clear-fix">
            <dl>
                <dt>企业服务</dt>
                <dd>
                    <a href="https://www.zhipin.com/job_detail/" ka="link-search">职位搜索</a>
                    <a href="https://news.zhipin.com/" ka="link-news">新闻资讯</a>
                    <a href="https://app.zhipin.com/" ka="link-app">BOSS直聘APP</a>
                </dd>
            </dl>
            <dl>
                <dt>使用与帮助</dt>
                <dd>
                    <a href="https://www.zhipin.com/register/protocol/introduce" ka="link-privacy" target="_blank">用户协议与隐私政策</a>
                    <a href="https://www.zhipin.com/activity/cc/anticheatguide.html" ka="link-anticheatguide" target="_blank">防骗指南</a>
                    <a href="https://www.zhipin.com/activity/cc/postrules.html" ka="link-postrules" target="_blank">职位发布规则</a>
                    <a href="https://www.zhipin.com/activity/cc/usehelp.html" ka="link-usehelp" target="_blank">使用帮助</a>
                </dd>
            </dl>
            <dl>
                <dt>联系BOSS直聘</dt>
                <dd>
                    <p>北京华品博睿网络技术有限公司</p>
                    <p>公司地址 北京市朝阳区太阳宫中路8号冠捷大厦302</p>
                    <p>联系电话 010-84150633</p>
                    <p>违法和不良信息举报邮箱 <a class="report-mail" href="mailto:jubao@kanzhun.com">jubao@kanzhun.com</a></p>
                </dd>
            </dl>
        </div>
        <div class="copyright">
            <p>
                <span>Copyright © 2019 BOSS直聘</span><span>京ICP备14013441号-5</span>
                <span>
                     <a href="https://www.zhipin.com/activity/cc/businesslicense.html" ka="link-businesslicense" target="_blank">
                         <img src="https://static.zhipin.com/zhipin/v138/web/geek/images/icon-badge-1.png" alt=""/>
                         电子营业执照
                     </a>
                 </span>
                <span><a href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010502032801" ka="link-beian" target="_blank">京公网安备11010502032801 <img src="https://static.zhipin.com/v2/web/geek/images/icon-beian.png" alt=""/></a></span>
                <span><a href="http://sdwj.zhipin.com/web/index.html" ka="link-sdwj" target="_blank">首都网警</a></span>
            </p>
        </div>
    </div>
</div>



</div>




<script src="../js/layui/layui.js"></script>
<script>
    layui.use('element', function(){
        var $ = layui.jquery
            ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块

        //触发事件
        var active = {
            tabAdd: function(){
                //新增一个Tab项
                element.tabAdd('demo', {
                    title: '新选项'+ (Math.random()*1000|0) //用于演示
                    ,content: '内容'+ (Math.random()*1000|0)
                    ,id: new Date().getTime() //实际使用一般是规定好的id，这里以时间戳模拟下
                })
            }
            ,tabDelete: function(othis){
                //删除指定Tab项
                element.tabDelete('demo', '44'); //删除：“商品管理”


                othis.addClass('layui-btn-disabled');
            }
            ,tabChange: function(){
                //切换到指定Tab项
                element.tabChange('demo', '22'); //切换到：用户管理
            }
        };

        $('.site-demo-active').on('click', function(){
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        });

        //Hash地址的定位
        var layid = location.hash.replace(/^#test=/, '');
        element.tabChange('test', layid);

        element.on('tab(test)', function(elem){
            location.hash = 'test='+ $(this).attr('lay-id');
        });

    });
</script>
</body>
</html>

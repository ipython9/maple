<%--
  Created by IntelliJ IDEA.
  User: 43530
  Date: 2019/3/26
  Time: 23:32
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
                <a href="https://www.zhipin.com/" ka="header-home-logo" title="枫叶直聘"><span>枫叶直聘</span></a>
            </div>
            <div class="nav">
                <ul>
                    <li class=""><a ka="header-home" href="${rootpath}/admin/index.html">首页</a></li>

                    <li class="cur"><a ka="header-job" href="${rootpath}/admin/searchjob.html">职位</a></li>
                    <li class=""><a ka="header_brand" href="${rootpath}/admin/serarchcompy.html">公司</a></li>

                </ul>
            </div>
            <div class="user-nav">
                <ul>

                    <%--<li class="nav-dot">·</li>--%>
                    <%--<li class="nav-up-file"><a class="header-resume-upload" ka="header-resume-upload-2" href="javascript:;">上传</a></li>--%>
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
                    <%--<li class=""><a ka="header-job" href="https://www.zhipin.com/job_detail/">个人中心</a></li>--%>
                </ul>
            </div>
        </div>
    </div>
    <br>


    <div style="margin: 0 auto;width: 1200px;">
        <div>
            <!-- 图片开始 -->
            <div class="job-banner">
                <div class="inner home-inner">
                    <div class="job-primary detail-box">
                        <div class="pos-bread">
                            <a href="/" ka="job-breadcrumb-top1">首页</a>
                            <i class="icon-arrow-right"></i>
                            <a href="/c101010100/" ka="job-breadcrumb-top2">北京招聘</a>·<a href="/p100103/" ka="job-breadcrumb-top21">PHP招聘</a>
                            <i class="icon-arrow-right"></i>
                            <a href="/c101010100-p100103/" ka="job-breadcrumb-top3">北京PHP招聘</a>
                            <i class="icon-arrow-right"></i>
                            <a href="/job_detail/fa833e073ad4ef291XF82dq_GVM~.html" ka="job-breadcrumb-top4">滴滴出行PHP招聘</a>
                        </div>
                        <div class="info-primary">
                            <div class="job-status"> ${cm.compyname} </div>
                            <div class="name">
                                <h1>${job.name}</h1>
                                <span class="salary">
                                    ${job.startpd}-${job.endpd}
                            </span>
                            </div>
                            <p>${job.city}<em class="dolt"></em>${job.exp}<em class="dolt"></em>${job.level}</p>
                        </div>
                        <div class="job-op">
                            <div class="btn-container">
                                <input type="hidden" id="parm1" value="${job.id}">
                                <input type="hidden" id="parm2"  value="${user.userid}">
                                <input type="hidden" id="parm3"  value="${job.userid}">
                                <a class="btn btn-startchat" id="333"   target="_blank">立即投递简历</a>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- 图片结束 -->
        </div>



        <div>

            <!-- 详细开始 -->
            <div class="job-box">
            <div class="inner home-inner">
            <div class="job-detail">
                <div class="detail-op">
                    <div class="btns">
                        <div class="op-links">


                            <a ka="job_detail_report" href="javascript:;" class="link-report">举报</a>
                        </div>
                    </div>

                    <div class="detail-figure">
                        <img src="${user1.picpath}" alt="">
                    </div>
                    <h2 class="name">${user1.username}<i class="icon-vip"></i></h2>
                    <p class="gray">HR<em class="vdot">·</em></p>
                </div>
                <div class="detail-content">
                    <div class="job-sec">
                        <h3>职位描述</h3>
                        <div class="text">
                            职位描述<br>${job.content}
                        </div>
                        <h3>职位要求</h3>
                        <div class="text">
                            职位要求<br>${job.jobreq}
                        </div>
                    </div>
                    <div class="job-sec company-info">
                        <h3>公司介绍</h3>
                        <div class="text">
                            ${cm.intoduction}
                        </div>

                    </div>

                    <div class="job-sec">
                        <h3>工商信息</h3>
                        <div class="name">${cm.compyname}  </div>
                        <div class="level-list">
                            <li><span>法人代表：</span>: ${cm.jurisname} </li>
                            <li><span>融资阶段：</span>: ${cm.random1} </li>
                            <li class="res-time"><span>入驻枫叶招聘时间：${cm.creatime}  </span></li>
                            <li class="company-type"><span>企业所属行业：</span> ${cm.industayid} </li>
                            <li class="manage-state"><span>经营状态：</span>开业</li>
                        </div>

                    </div>
                    <div class="job-sec">
                        <h3>工作地址</h3>
                        <div class="job-location">
                            <div class="location-address"> ${cm.regaddress} </div>
                        </div>
                    </div>


                </div>
            </div>
        </div>
        <!-- 详细结束 -->
    </div>



</div>




</div>














    <div id="footer">
        <div class="inner home-inner">
            <div class="footer-social">

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
                        <a href="https://app.zhipin.com/" ka="link-app">枫叶直聘APP</a>
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
                    <dt>联系枫叶直聘</dt>
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
                    <span>Copyright © 2019 枫叶直聘</span><span>京ICP备14013441号-5</span>
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
    <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#333').click(function() {
                var jobid = $('#parm1').val();
                var userid = $('#parm2').val();
                var createuserid = $('#parm3').val();
                $.ajax(
                    {
                        url: "/userjob/addOne.do?jobid="+jobid+"&userid="+userid+"&createuserid="+createuserid,
                        type: "get",
                        dataType: "json",
                        success: function (data) {
                            alert("投递成功!请在控制台查看详细进度");
                        }
                    }
                )

            })
        }
        )
    </script>

</body>
</html>

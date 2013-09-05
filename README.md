radius v0.0.1
======

一个ISP商的网络管理系统,B/S模式系统。

#### 项目架构
* 开发语言: java, sql, javascript, html, css.
* 前端JS类库：jquery, angluar.js
* 前端css框架: bootstrap2.3.2
* mvc框架: spring mvc
* orm框架: mybatis
* 数据库: mysql
* web服务器: tomcat
* 服务器操作系统: linux

## webapp 目录结构 v0.0.1 2013-08-20
+ webapp
	+	admin (管理员相关页面目录)
		+	index.html (admin登入页面)
		+	main.html (登入后的主页面)
		+	user (用户相关页面目录)
			+	userlayer.jsp
			+	adduser.jsp
			+	userlist.jsp
		+ serivces (plan相关页面)
			+ servicelist.jsp (plan列表)
			+ createservice.jsp (创建plan)
		+	report (报告相关页面目录)
			+ reportlayer.jsp
			+ onlineuser.jsp
		+	nas (NAS相关页面目录)
			+ naslayer.jsp
			+ addnas.jsp
			+ naslist.jsp
		+	card (卡相关页面目录)
			+ cardlayer.jsp
			+ addcard.jsp
			+ card-userlist.jsp
	+	public (静态资源目录，javascript, css, images)


## 功能列表 v0.0.1 2013-08-20
<ul>
	<li>系统
		<ul>
			<li>登入 [2013-09-05]</li>
			<li>注销 [2013-09-05]</li>
		</ul>
	</li>
  <li>用户
    <ul>
      <li>添加新用户 [2013-09-05]</li>
      <li>用户列表 [2013-09-05]</li>
      <li>编辑用户 [-]</li>
    <ul>
  </li>
  <li>Services
    <ul>
      <li>创建服务 [-]</li>
      <li>服务列表 [-]</li>
      <li>编辑服务 [-]</li>
    <ul>
  </li>
  <li>NAS管理
    <ul>
      <li>新建NAS [-]</li>
      <li>NAS列表 [-]</li>
    <ul>
  </li>
  <li>报告
    <ul>
      <li>用户在线 [-]</li>
      <li>用户流量报告 [-]</li>
    <ul>
  </li>
  <li>卡片
    <ul>
      <li>添加新的卡片 [-]</li>
      <li>罗列所有卡用户 [-]</li>
    <ul>
  </li>
</ul>

radius 数据库表格说明
=====================

#### All Table
*  [rm_users](#rm_users) [用户信息表] [共计42个字段]
*  [rm_usergroups](#rm_usergroups) [用户组信息表] [共计3个字段]
*  [nas](#nas) [nas] [共计13个字段]
*  [rm_managers](#rm_managers) [管理者信息表] [共计41个字段]
*  [rm_services](#rm_services) [服务信息表] [共计58个字段]
*  [rm_invoices](#rm_invoices) [] [共计39个字段]
*  [rm_ias](#rm_ias) [] [共计15个字段]
*  [rm_changesrv](#rm_changesrv) [用户更换服务时记录的的一张表] [共计9个字段]
*  [rm_cards](#rm_cards) [卡信息记录表] [共计21个字段]
*  [rm_actsrv](#rm_actsrv) [用户激活服务记录表，那个用户，什么时候，激活了什么服务] [共计5个字段]

* <h4 id='rm_users'>rm_users</h4> [用户信息表] [共计42个字段] [back](#all-table)

<table>
  <tr>
    <th>字段</th><th>描述</th>
  </tr>
  <tr>
    <td>username</td><td>用户名或MAC地址</td>
  </tr>
  <tr>
    <td>password</td><td>密码</td>
  </tr>
  <tr>
    <td>groupid</td><td>用户组</td>
  </tr>
  <tr>
    <td>enableuser</td><td>授权用户</td>
  </tr>
  <tr>
    <td>uplimit</td><td>上传限制</td>
  </tr>
  <tr>
    <td>downlimit</td><td>下载限制</td>
  </tr>
  <tr>
    <td>comblimit</td><td>合计限制</td>
  </tr>
  <tr>
    <td>firstname</td><td>姓氏</td>
  </tr>
  <tr>
    <td>lastname</td><td>名字</td>
  </tr>
  <tr>
    <td>company</td><td>公司</td>
  </tr>
  <tr>
    <td>phone</td><td>固话</td>
  </tr>
  <tr>
    <td>mobile</td><td>手机</td>
  </tr>
  <tr>
    <td>address</td><td>地址</td>
  </tr>
  <tr>
    <td>city</td><td>城市</td>
  </tr>
  <tr>
    <td>zip</td><td>邮编</td>
  </tr>
  <tr>
    <td>country</td><td>国家</td>
  </tr>
  <tr>
    <td>state</td><td>省(市)</td>
  </tr>
  <tr>
    <td>comment</td><td>注释</td>
  </tr>
  <tr>
    <td>mac</td><td>MAC地址</td>
  </tr>
  <tr>
    <td>usemacauth</td><td>仅限此MAC地址</td>
  </tr>
  
  <tr>
    <td>expiration</td><td>账户到期</td>
  </tr>
  <tr>
    <td>uptimelimit</td><td>可用联机时间</td>
  </tr>
  <tr>
    <td>srvid</td><td></td>
  </tr>
  <tr>
    <td>staticip</td><td>静态IP地址</td>
  </tr>
  <tr>
    <td>usestaticip</td><td>仅限此用户静态IP地址</td>
  </tr>
  
  <tr>
    <td>createdon</td><td></td>
  </tr>
  <tr>
    <td>acctype</td><td></td>
  </tr>
  <tr>
    <td>credits</td><td></td>
  </tr>
  <tr>
    <td>cardfails</td><td></td>
  </tr>
  <tr>
    <td>createdby</td><td></td>
  </tr>
  
  <tr>
    <td>owner</td><td></td>
  </tr>
  <tr>
    <td>taxid</td><td></td>
  </tr>
  <tr>
    <td>email</td><td>电子邮件</td>
  </tr>
  <tr>
    <td>maccm</td><td>CM MAC 地址</td>
  </tr>
  <tr>
    <td>custattr</td><td></td>
  </tr>
  
  <tr>
    <td>warningsent</td><td></td>
  </tr>
  <tr>
    <td>verifycode</td><td></td>
  </tr>
  <tr>
    <td>verified</td><td></td>
  </tr>
  <tr>
    <td>selfreg</td><td></td>
  </tr>
  <tr>
    <td>verifyfails</td><td></td>
  </tr>
  
   <tr>
    <td>verifysentnum</td><td></td>
  </tr>
  <tr>
    <td>verifymobile</td><td></td>
  </tr>
</table>

* <h4 id='rm_usergroups'>rm_usergroups</h4> [用户组信息表] [共计3个字段] [back](#all-table)

<table>
	<tr>
		<th>字段</th><th>描述</th>
	</tr>
	<tr>
		<td>groupid</td><td>组id 自动增长</td>
	</tr>
	<tr>
		<td>groupname</td><td>组名</td>
	</tr>
	<tr>
		<td>descr</td><td>描述</td>
	</tr>
</table>

* <h4 id='nas'>nas</h4> [nas] [共计13个字段] [back](#all-table)

<table>
	<tr>
		<th>字段</th>
		<th>描述</th>
	</tr>
	<tr>
		<td>id</td><td>编号 自动增长</td>
	</tr>
	<tr>
		<td>nasname</td><td>NAS名称</td>
	</tr>
	<tr>
		<td>shortname</td><td></td>
	</tr>
	<tr>
		<td>type</td><td>类型</td>
	</tr>
	<tr>
		<td>ports</td><td></td>
	</tr>
	
	<tr>
		<td>secret</td><td></td>
	</tr>
	<tr>
		<td>community</td><td></td>
	</tr>
	<tr>
		<td>description</td><td>描述</td>
	</tr>
	<tr>
		<td>starospassword</td><td></td>
	</tr>
	<tr>
		<td>ciscobwmode</td><td>支持Cisco bandwidth</td>
	</tr>
	
	<tr>
		<td>apiusername</td><td>API 用户名</td>
	</tr>
	<tr>
		<td>apipassword</td><td>API 用户密码</td>
	</tr>
	<tr>
		<td>enableapi</td><td>启用 Mikrotik API</td>
	</tr>
</table>

* <h4 id='rm_managers'>rm_managers</h4> [管理者信息表] [共计41个字段] [back](#all-table)

<table>
	<tr>
		<th>字段</th><th>描述</th>
	</tr>
	<tr>
		<td>managername</td><td>管理员姓名</td>
	</tr>
	<tr>
		<td>password</td><td>密码</td>
	</tr>
	<tr>
		<td>firstname</td><td>名字</td>
	</tr>
	<tr>
		<td>lastname</td><td>姓氏</td>
	</tr>
	<tr>
		<td>phone</td><td>固话</td>
	</tr>
	<tr>
		<td>mobile</td><td>手机</td>
	</tr>
	<tr>
		<td>address</td><td>地址</td>
	</tr>
	<tr>
		<td>city</td><td>城市</td>
	</tr>
	<tr>
		<td>zip</td><td>邮编</td>
	</tr>
	<tr>
		<td>country</td><td>国家</td>
	</tr>
	<tr>
		<td>state</td><td>省(市)</td>
	</tr>
	<tr>
		<td>comment</td><td>注释</td>
	</tr>
	<tr>
		<td>company</td><td>公司名称</td>
	</tr>
	<tr>
		<td>vatid</td><td>VAT id</td>
	</tr>
	<tr>
		<td>email</td><td>邮箱</td>
	</tr>
	<tr>
		<td>balance</td><td>支出列表</td>
	</tr>
	<tr>
		<td>perm_listusers</td><td>用户列表</td>
	</tr>
	<tr>
		<td>perm_createusers</td><td>创建用户</td>
	</tr>
	<tr>
		<td>perm_editusers</td><td>编辑用户</td>
	</tr>
	<tr>
		<td>perm_edituserspriv</td><td>修改用户数据权限</td>
	</tr>
	<tr>
		<td>perm_deleteusers</td><td>删除用户</td>
	</tr>
	<tr>
		<td>perm_listmanagers</td><td>管理员列表</td>
	</tr>
	<tr>
		<td>perm_createmanagers</td><td>建立管理员</td>
	</tr>
	<tr>
		<td>perm_editmanagers</td><td>编辑管理员</td>
	</tr>
	<tr>
		<td>perm_deletemanagers</td><td>删除管理员</td>
	</tr>
	<tr>
		<td>perm_listservices</td><td>服务列表</td>
	</tr>
	<tr>
		<td>perm_createservices</td><td>建立服务</td>
	</tr>
	<tr>
		<td>perm_editservices</td><td>编辑服务</td>
	</tr>
	<tr>
		<td>perm_deleteservices</td><td>删除服务</td>
	</tr>
	<tr>
		<td>perm_listonlineusers</td><td>在线用户列表</td>
	</tr>
	<tr>
		<td>perm_listinvoices</td><td>本人账单列表</td>
	</tr>
	<tr>
		<td>perm_trafficreport</td><td>流量报告</td>
	</tr>
	<tr>
		<td>perm_addcredits</td><td>账单功能</td>
	</tr>
	<tr>
		<td>perm_negbalance</td><td>产生支出</td>
	</tr>
	<tr>
		<td>perm_listallinvoices</td><td>全部账单列表</td>
	</tr>
	<tr>
		<td>perm_logout</td><td>登出用户</td>
	</tr>
	<tr>
		<td>perm_cardsys</td><td>访问卡片系统</td>
	</tr>
	<tr>
		<td>perm_editinvoice</td><td>编辑账单</td>
	</tr>
	<tr>
		<td>perm_allusers</td><td>存取所有用户的需求</td>
	</tr>
	<tr>
		<td>perm_allowdiscount</td><td>允许折扣价格</td>
	</tr>
	<tr>
		<td>enablemanager</td><td>激活管理员</td>
	</tr>
	
</table>

* <h4 id='rm_services'>rm_services</h4> [服务信息表] [共计58个字段] [back](#all-table)

<table>
	<tr>
		<th>字段</th><th>描述</th>
	</tr>
	<tr>
		<td>srvid</td><td>服务ID，自动增长</td>
	</tr>
	<tr>
		<td>srvname</td><td>服务名称</td>
	</tr>
	<tr>
		<td>downrate</td><td>设置速率 下载</td>
	</tr>
	<tr>
		<td>uprate</td><td>设置速率 上传</td>
	</tr>
	<tr>
		<td>limitdl</td><td>限制下载字节</td>
	</tr>
	<tr>
		<td>limitul</td><td>限制上传字节</td>
	</tr>
	<tr>
		<td>limitcomb</td><td>限制合计流量</td>
	</tr>
	<tr>
		<td>limitexpiration</td><td>限制到期</td>
	</tr>
	<tr>
		<td>limituptime</td><td>限制在线时间</td>
	</tr>
	<tr>
		<td>poolname</td><td>IP地址池名</td>
	</tr>
	<tr>
		<td>unitprice</td><td>净单价 总价</td>
	</tr>
	<tr>
		<td>unitpriceadd</td><td>净欠款 总欠款</td>
	</tr>
	<tr>
		<td>timebaseexp</td><td></td>
	</tr>
	<tr>
		<td>timebaseonline</td><td></td>
	</tr>
	<tr>
		<td>timeunitexp</td><td>时间单位</td>
	</tr>
	<tr>
		<td>timeunitonline</td><td>在线时间单位</td>
	</tr>
	<tr>
		<td>trafficunitdl</td><td>下载流量单位</td>
	</tr>
	<tr>
		<td>trafficunitul</td><td>上传流量单位</td>
	</tr>
	<tr>
		<td>trafficunitcomb</td><td>合计流量单位</td>
	</tr>
	<tr>
		<td>inittimeexp</td><td>时间单位初始化</td>
	</tr>
	<tr>
		<td>inittimeonline</td><td>在线时间单位初始化</td>
	</tr>
	<tr>
		<td>initdl</td><td>下载流量单位初始化</td>
	</tr>
	<tr>
		<td>initul</td><td>上传流量单位初始化</td>
	</tr>
	<tr>
		<td>inittotal</td><td>合计流量单位初始化</td>
	</tr>
	<tr>
		<td>srvtype</td><td>服务类型</td>
	</tr>
	<tr>
		<td>timeaddmodeexp</td><td></td>
	</tr>
	<tr>
		<td>timeaddmodeonline</td><td></td>
	</tr>
	<tr>
		<td>trafficaddmode</td><td></td>
	</tr>
	<tr>
		<td>monthly</td><td>按月计算</td>
	</tr>
	<tr>
		<td>enaddcredits</td><td>允许欠款</td>
	</tr>
	<tr>
		<td>minamount</td><td>最小基本数量</td>
	</tr>
	<tr>
		<td>minamountadd</td><td>最小增加数量</td>
	</tr>
	<tr>
		<td>resetcounters</td><td>到期后重新计算</td>
	</tr>
	<tr>
		<td>pricecalcdownload</td><td></td>
	</tr>
	<tr>
		<td>pricecalcupload</td><td></td>
	</tr>
	<tr>
		<td>pricecalcuptime</td><td></td>
	</tr>
	<tr>
		<td>unitpricetax</td><td></td>
	</tr>
	<tr>
		<td>unitpriceaddtax</td><td></td>
	</tr>
	<tr>
		<td>enableburst</td><td>允许突发模式</td>
	</tr>
	<tr>
		<td>dlburstlimit</td><td>突发限制下载</td>
	</tr>
	<tr>
		<td>ulburstlimit</td><td>突发限制上传</td>
	</tr>
	<tr>
		<td>dlburstthreshold</td><td>突发门限 下载</td>
	</tr>
	<tr>
		<td>ulburstthreshold</td><td>突发门限 上载</td>
	</tr>
	<tr>
		<td>dlbursttime</td><td>突发时间 下载</td>
	</tr>
	<tr>
		<td>ulbursttime</td><td>突发时间 上传</td>
	</tr>
	<tr>
		<td>enableservice</td><td>激活服务</td>
	</tr>
	<tr>
		<td>dlquota</td><td></td>
	</tr>
	<tr>
		<td>ulquota</td><td></td>
	</tr>
	<tr>
		<td>combquota</td><td></td>
	</tr>
	<tr>
		<td>timequota</td><td></td>
	</tr>
	<tr>
		<td>priority</td><td>优先级</td>
	</tr>
	<tr>
		<td>nextsrvid</td><td>下一服务</td>
	</tr>
	<tr>
		<td>dailynextsrvid</td><td>日配额超限服务</td>
	</tr>
	<tr>
		<td>availucp</td><td>在用户控制面板可用</td>
	</tr>
	<tr>
		<td>renew</td><td>自动更新</td>
	</tr>
	<tr>
		<td>policymapdl</td><td>Cisco策略映射 (DL)</td>
	</tr>
	<tr>
		<td>policymapul</td><td>Cisco 策略映射 (UL)</td>
	</tr>
	<tr>
		<td>custattr</td><td>自定义RADIUS属性</td>
	</tr>
	
	
</table>

* <h4 id='rm_changesrv'>rm_changesrv</h4> [用户更换服务时记录的的一张表] [共计9个字段] [back](#all-table)

<table>
	<tr>
		<th>#</th><th>字段</th><th>描述</th>
	</tr>
	<tr>
		<td>1</td><td>id</td><td>自动增长 ID</td>
	</tr>
	<tr>
		<td>2</td><td>username</td><td></td>
	</tr>
	<tr>
		<td>3</td><td>newsrvid</td><td></td>
	</tr>
	<tr>
		<td>4</td><td>newsrvname</td><td></td>
	</tr>
	<tr>
		<td>5</td><td>scheduledate</td><td></td>
	</tr>
	<tr>
		<td>6</td><td>requestdate</td><td></td>
	</tr>
	<tr>
		<td>7</td><td>status</td><td></td>
	</tr>
	<tr>
		<td>8</td><td>transid</td><td></td>
	</tr>
	<tr>
		<td>9</td><td>requested</td><td></td>
	</tr>
</table>

* <h4 id='rm_cards'>rm_cards</h4> [卡信息记录表] [共计21个字段] [back](#all-table)

<table>
	<tr>
		<th>#</th><th>字段</th><th>描述</th>
	</tr>
	<tr>
		<td>1</td><td>id</td><td>ID</td>
	</tr>
	<tr>
		<td>2</td><td>cardnum</td><td></td>
	</tr>
	<tr>
		<td>3</td><td>password</td><td></td>
	</tr>
	<tr>
		<td>4</td><td>value</td><td></td>
	</tr>
	<tr>
		<td>5</td><td>expiration</td><td></td>
	</tr>
	<tr>
		<td>6</td><td>series</td><td></td>
	</tr>
	<tr>
		<td>7</td><td>date</td><td></td>
	</tr>
	<tr>
		<td>8</td><td>owner</td><td></td>
	</tr>
	<tr>
		<td>9</td><td>used</td><td></td>
	</tr>
	<tr>
		<td>10</td><td>cardtype</td><td></td>
	</tr>
	<tr>
		<td>11</td><td>revoked</td><td></td>
	</tr>
	<tr>
		<td>12</td><td>downlimit</td><td></td>
	</tr>
	<tr>
		<td>13</td><td>uplimit</td><td></td>
	</tr>
	<tr>
		<td>14</td><td>comblimit</td><td></td>
	</tr>
	<tr>
		<td>15</td><td>uptimelimit</td><td></td>
	</tr>
	<tr>
		<td>16</td><td>srvid</td><td></td>
	</tr>
	<tr>
		<td>17</td><td>transid</td><td></td>
	</tr>
	<tr>
		<td>18</td><td>active</td><td></td>
	</tr>
	<tr>
		<td>19</td><td>expiretime</td><td></td>
	</tr>
	<tr>
		<td>20</td><td>timebaseexp</td><td></td>
	</tr>
	<tr>
		<td>21</td><td>timebaseonline</td><td></td>
	</tr>
	
</table>

* <h4 id='rm_actsrv'>rm_actsrv</h4> [用户激活服务记录表，那个用户，什么时候，激活了什么服务] [共计5个字段] [back](#all-table)

<table>
	<tr>
		<th>#</th><th>字段</th><th>描述</th>
	</tr>
	<tr>
		<td>1</td><td>id</td><td>ID</td>
	</tr>
	<tr>
		<td>2</td><td>datetime</td><td></td>
	</tr>
	<tr>
		<td>3</td><td>username</td><td></td>
	</tr>
	<tr>
		<td>4</td><td>srvid</td><td></td>
	</tr>
	<tr>
		<td>5</td><td>dailynextsrvactive</td><td></td>
	</tr>
</table>


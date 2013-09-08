<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>
<div class="container">
	<div class="row">
		<jsp:include page="alert.jsp"></jsp:include>
		<h3 class="text-center">${title }</h3>
		<form class="form-inline" method="post" action="${action}" id="createServiceForm">
			<fieldset>
				<div>
					<legend>
						<h3 class="alert">基本参数</h3>
					</legend>
				</div>
				<div class="row">
					<div class="span4">
						<div id="cg-servce-name" class="control-group">
							<label class="control-label">服务名称:</label>
							<div class="controls">
								<input type="text" 
									placeholder="Serivce name" 
									class="input-xlarge" 
									required id="srvname" name="srvname" value="${service.srvname }" />
								<p class="help-block"></p>
							</div>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.enableservice == 1 }">checked</c:if>
									 name="enableservice" value="1"/> 激活服务
							</label>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.availucp == 1 }">checked</c:if>
								 name="availucp" value="1"/> 在用户版面可用
							</label>
						</div>
						<div class="control-group">
							<div class="row">
								<div class="span4">
									<label class="control-label">服务类型:</label>
								</div>
								<div class="span8">
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${service != null && service.srvtype == 0 }">checked</c:if>
										 name="srvtype" value="0"/> 常规预付
									</label> 
									<br /> 
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${service != null && service.srvtype == 1 }">checked</c:if>
										name="srvtype" value="1"/> 预付卡或直接访问服务
									</label> 
									<br /> 
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${service != null && service.srvtype == 2 }">checked</c:if>
										name="srvtype" value="2"/> 后付费
									</label> 
									<br /> 
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${service != null && service.srvtype == 3 }">checked</c:if>
										name="srvtype" value="3"/> Email通知
									</label>
									<br /> 
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${service != null && service.srvtype == 4 }">checked</c:if>
										name="srvtype" value="4"/> 访问列表登录
									</label>
								</div>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.limitcomb == 1 }">checked</c:if>
								 name="limitcomb" value="1"/> 限制合计流量:
							</label>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.limitexpiration == 1 }">checked</c:if>
								 name="limitexpiration" value="1"/> 限制到期:
							</label>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.limituptime == 1 }">checked</c:if>
								 name="limituptime" value="1"/> 限制在线时间:
							</label>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.enableburst == 1 }">checked</c:if>
								 name="enableburst" value="1"/> 允许突发模式:
							</label>
						</div>
						<div class="control-group">
							<label class="control-label">设置速率(下载/上传):</label>
							<div class="controls">
								<input type="text" 
									placeholder="" 
									class="input-mini" 
									required id="downrate" name="downrateKB"  value="${service.downrateKB }"/>&nbsp;/&nbsp;
								<input type="text" 
									placeholder="" 
									class="input-mini" 
									required id="uprate" name="uprateKB"  value="${service.uprateKB }" />&nbsp;kbps (0 - 无限制)
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">突发限制(下载/上传):</label>
							<div class="controls">
								<input type="text" 
									placeholder="" 
									class="input-mini" 
									required id="dlburstlimit" name="dlburstlimitKB" value="${service.dlburstlimitKB }"  />&nbsp;/&nbsp;
								<input type="text" 
									placeholder="" 
									class="input-mini" 
									required id="ulburstlimit" name="ulburstlimitKB" value="${service.ulburstlimitKB }" />&nbsp;kbps
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">突发门限(下载/上传):</label>
							<div class="controls">
								<input type="text" 
									placeholder="" 
									class="input-mini" 
									required id="dlburstthreshold" name="dlburstthresholdKB" value="${service.dlburstthresholdKB }" />&nbsp;/&nbsp;
								<input type="text" 
									placeholder="" 
									class="input-mini" 
									required id="ulburstthreshold" name="ulburstthresholdKB" value="${service.ulburstthresholdKB }" />&nbsp;kbps
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">突发时间(下载/上传):</label>
							<div class="controls">
								<input type="text" 
									placeholder="" 
									class="input-mini" 
									required id="dlbursttime" name="dlbursttime" value="${service.dlbursttime }" />&nbsp;/&nbsp;
								<input type="text" 
									placeholder="" 
									class="input-mini" 
									required id="ulbursttime" name="ulbursttime" value="${service.ulbursttime }" />&nbsp;秒
							</div>
						</div>
						<div class="control-group">
							<label id="" class="control-label">IP地址池名:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" required
									 id="poolname" name="poolname" value="${service.poolname }" />
							</div>
						</div>
						<div class="control-group">
							<label id="cg-password" class="control-label">下一服务:</label>
							<div class="controls">
								<select name="nextsrvid" id="nextsrvid" class="input-xlarge">
									<c:forEach var="srvitem" items="${services }">
										<option value="${srvitem.srvid}" 
										<c:if test="${service != null && service.nextsrvid == srvitem.srvid }">selected="selected"</c:if>
										>${srvitem.srvname }</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="control-group">
							<label id="cg-password" class="control-label">日配额超限服务:</label>
							<div class="controls">
								<select name="dailynextsrvid" id="dailynextsrvid" class="input-xlarge">
									<c:forEach var="srvitem" items="${services }">
										<option value="${srvitem.srvid}" 
										<c:if test="${service != null && service.dailynextsrvid == srvitem.srvid }">selected="selected"</c:if>
										>${srvitem.srvname }</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label id="cg-password" class="control-label">允许的 NASs:</label>
							<div class="controls">
								<select name="nasidArray" id="nasid" multiple="multiple" style="height: 200px;">
									<c:forEach var="nas" items="${nases }">
										<option value="${nas.id}"
										<c:forEach var="cur_nas" items="${service.nases }">
											<c:if test="${nas.id == cur_nas.id }">selected="selected"</c:if>
										</c:forEach>
										>${nas.shortname }</option>
									</c:forEach>
								</select>
								
							</div>
						</div>
						<div class="control-group">
							<label id="cg-password" class="control-label">可用的管理员:</label>
							<div class="controls">
								<select name="managernameArray" id="managername" multiple="multiple" style="height: 200px;">
									<c:forEach var="manager" items="${managers }">
										<option value="${manager.managername }"
										<c:forEach var="cur_manager" items="${service.managers }">
											<c:if test="${manager.managername == cur_manager.managername }">selected="selected"</c:if>
										</c:forEach>
										>${manager.managername }</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
				</div>
				<div>
					<legend>
						<h3 class="alert">预付和后付价格定义</h3>
					</legend>
				</div>
				<div class="row">
					<div class="span4">
						<div class="control-group">
							<p>后付费用户计费方式:</p>
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.pricecalcdownload == 1 }">checked</c:if>
								 name="pricecalcdownload" value="1"/> 下载流量
							</label>
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.pricecalcupload == 1 }">checked</c:if>
								 name="pricecalcupload" value="1"/> 上传流量
							</label>
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.pricecalcuptime == 1 }">checked</c:if>
								 name="pricecalcuptime" value="1"/> 在线时间
							</label>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.monthly == 1 }">checked</c:if>
								 name="monthly" value="1"/> 按月计算
							</label>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.renew == 1 }">checked</c:if>
								 name="renew" value="1"/> 自动更新
							</label>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.resetcounters == 1 }">checked</c:if>
								 name="resetcounters" value="1"/> 到期后重新计算
							</label>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${service != null && service.enaddcredits == 1 }">checked</c:if>
								 name="enaddcredits" value="1"/> 允许欠款
							</label>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label class="control-label">净单价:</label>
							<div class="controls">
								<div class="input-prepend input-append">
								  	<span class="add-on">$</span>
								  	<input class="span2" name="unitprice" type="number" value="${service.unitprice}" />
								</div>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">总价:</label>
							<div class="controls">
								<div class="input-prepend input-append">
								  	<span class="add-on">$</span>
								  	<input class="span2" name="" type="number" value="${service.unitprice}"/>
								</div>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">净欠款:</label>
							<div class="controls">
								<div class="input-prepend input-append">
								  	<span class="add-on">$</span>
								  	<input class="span2" name="unitpriceadd" type="number" value="${service.unitpriceadd}"/>
								</div>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">总欠款:</label>
							<div class="controls">
								<div class="input-prepend input-append">
								  	<span class="add-on">$</span>
								  	<input class="span2" name="" type="number" value="${service.unitpriceadd}"/>
								</div>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="row">
							<div class="span4">
								<label class="control-label">日期累加模式:</label>
							</div>
							<div class="span8">
								<label class="radio" style="margin-bottom: 5px;" > 
									<input type="radio" 
									<c:if test="${service != null && service.timeaddmodeexp == 0 }">checked</c:if>
									 name="timeaddmodeexp" value="0"/> 重置到期时间
								</label> 
								<br /> 
								<label class="radio" style="margin-bottom: 5px;" > 
									<input type="radio" 
									<c:if test="${service != null && service.timeaddmodeexp == 1 }">checked</c:if>
									name="timeaddmodeexp" value="1"/> 延长到期时间
								</label> 
								<br /> 
								<label class="radio" style="margin-bottom: 5px;" > 
									<input type="radio" 
									<c:if test="${service != null && service.timeaddmodeexp == 2 }">checked</c:if>
									name="timeaddmodeexp" value="2"/> 到期日期延长修改
								</label> 
							</div>
						</div>
						<div class="row">
							<div class="span4">
								<label class="control-label">时间累加模式:</label>
							</div>
							<div class="span8">
								<label class="radio" style="margin-bottom: 5px;" > 
									<input type="radio" 
									<c:if test="${service != null && service.timeaddmodeonline == 0 }">checked</c:if>
									 name="timeaddmodeonline" value="0"/> 重置在线时间
								</label> 
								<br /> 
								<label class="radio" style="margin-bottom: 5px;" > 
									<input type="radio" 
									<c:if test="${service != null && service.timeaddmodeonline == 1 }">checked</c:if>
									name="timeaddmodeonline" value="1"/> 延长在线时间
								</label> 
							</div>
						</div>
						<div class="row">
							<div class="span4">
								<label class="control-label">流量增加模式:</label>
							</div>
							<div class="span8">
								<label class="radio" style="margin-bottom: 5px;" > 
									<input type="radio" 
									<c:if test="${service != null && service.trafficaddmode == 0 }">checked</c:if>
									 name="trafficaddmode" value="0"/> 流量计数重置
								</label> 
								<br /> 
								<label class="radio" style="margin-bottom: 5px;" > 
									<input type="radio" 
									<c:if test="${service != null && service.trafficaddmode == 1 }">checked</c:if>
									name="trafficaddmode" value="1"/> 附加
								</label> 
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="span8 offset2">
						<div class="control-group">
							<label class="control-label">时间单位:</label>
							<div class="controls">
								<input class="span2" name="timeunitexp" type="number" value="${service.timeunitexp}"/>
								 初始化: <input class="span2" name="inittimeexp" type="number" value="${service.inittimeexp}" />
								 <select name="timebaseexp">
								 	<option value="0" 
								 		<c:if test="${service != null && service.timebaseexp == 0 }">selected="selected"</c:if> >天(s)</option>
								 	<option value="1"
								 		<c:if test="${service != null && service.timebaseexp == 1 }">selected="selected"</c:if> >月(s)</option>
								 </select>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">在线时间单位:</label>
							<div class="controls">
								<input class="span2" name="timeunitonline" type="number" value="${service.timeunitonline}" />
								 初始化: <input class="span2" name="inittimeonline" type="number" value="${service.inittimeonline}"/>
								 <select name="timebaseonline">
								 	<option value="0"
								 		<c:if test="${service != null && service.timebaseonline == 0 }">selected="selected"</c:if>>分钟(s)</option>
								 	<option value="1"
								 		<c:if test="${service != null && service.timebaseonline == 1 }">selected="selected"</c:if>>小时(s)</option>
								 </select>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">下载流量单位:</label>
							<div class="controls">
								<input class="span2" name="trafficunitdl" type="number" value="${service.trafficunitdl}"/>
								 初始化: <input class="span2" name="initdl" type="number" value="${service.initdl}"/>&nbsp;MB
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">上传流量单位:</label>
							<div class="controls">
								<input class="span2" name="trafficunitul" type="number" value="${service.trafficunitul}" />
								 初始化: <input class="span2" name="initul" type="number" value="${service.initul}" />&nbsp;MB
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">合计流量单位:</label>
							<div class="controls">
								<input class="span2" name="trafficunitcomb" type="number" value="${service.trafficunitcomb}"/>
								 初始化: <input class="span2" name="inittotal" type="number" value="${service.inittotal}"/>&nbsp;MB
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">最小基本数量:</label>
							<div class="controls">
								<input class="span2" name="minamount" type="number" value="${service.minamount}"/>&nbsp;单位
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">最小增加数量:</label>
							<div class="controls">
								<input class="span2" name="minamountadd" type="number" value="${service.minamountadd}"/>&nbsp;单位
							</div>
						</div>
					</div>
				</div>
				<div class="control-group" style="margin-top: 20px;">
					<div class="controls">
						<input type="submit" name="action-service" id="action-service" value="${actionsrc}" class="btn btn-large btn-primary" />
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
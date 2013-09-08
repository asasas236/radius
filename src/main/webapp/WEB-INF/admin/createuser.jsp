<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<jsp:include page="header.jsp"></jsp:include>
<div class="container">
	<div class="row">
		<jsp:include page="alert.jsp"></jsp:include>
		<h3 class="text-center">${title }</h3>
		<form class="form-inline" method="post" action="${action}" id="createuserForm">
			
			<fieldset>
				<div>
					<legend>
						<h3 class="alert">重点项</h3>
					</legend>
					<div class="accordion" id="user-accordion">
						<div class="accordion-group">
							<div class="accordion-heading">
					    		<a class="accordion-toggle" data-toggle="collapse" data-parent="#user-accordion" href="#collapseOne">
					      			User Information
					    		</a>
					  		</div>	
					  		<div id="collapseOne" class="accordion-body collapse">
					    		<div class="accordion-inner alert alert-info" style="margin-bottom:0px;">
					      			<div class="">
										<div class="row" >
											<div class="span1">
												<div style="margin-bottom:10px;"><strong>用户名:</strong></div>
												<div style="margin-bottom:10px;"><strong>账户类型:</strong></div>
												<div style="margin-bottom:10px;"><strong>账户状态:</strong></div>
												<div style="margin-bottom:10px;"><strong>连接状态:</strong></div>
												<div style="margin-bottom:10px;"><strong>注册于:</strong></div>
												<div style="margin-bottom:10px;"><strong>注册人:</strong></div>
											</div>
											<div class="span2">
												<div style="margin-bottom:10px;">${user.username }&nbsp;</div>
												<div style="margin-bottom:10px;">
													<c:choose>
														<c:when test="${user.acctype == 1 }">通用用户</c:when>
														<c:when test="${user.acctype == 2 }">Mikrotik Hotspot MAC 用户</c:when>
														<c:when test="${user.acctype == 3 }">Mikrotik 访问列表登录</c:when>
														<c:when test="${user.acctype == 4 }">StarOS 访问列表登录</c:when>
													</c:choose>&nbsp;
												</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">${user.createdon }&nbsp;</div>
												<div style="margin-bottom:10px;">${user.createdby }&nbsp;</div>
											</div>
											
											<div class="span1">
												<div style="margin-bottom:10px;"><strong>验证码:</strong></div>
												<div style="margin-bottom:10px;"><strong>短信验证:</strong></div>
												<div style="margin-bottom:10px;"><strong>当前IP:</strong></div>
												<div style="margin-bottom:10px;"><strong>最近离线:</strong></div>
												<div style="margin-bottom:10px;"><strong>主叫ID:</strong></div>
												<div style="margin-bottom:10px;"><strong>NAS限制:</strong></div>
											</div>
											<div class="span2">
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
											</div>
											
											<div class="span1">
												<div style="margin-bottom:10px;"><strong>卡片系列:</strong></div>
												<div style="margin-bottom:10px;"><strong>修改服务:</strong></div>
												<div style="margin-bottom:10px;"><strong>新服务名:</strong></div>
											</div>
											<div class="span2">
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
												<div style="margin-bottom:10px;">&nbsp;</div>
											</div>
										</div>
									</div>
					    		</div>
					  		</div>
					 	</div>
					 </div>
					
					
				</div>
				<div class="row">
					<div class="span4">
						<div id="cg-username" class="control-group">
							<label class="control-label">UserName or Mac Address:</label>
							<div class="controls">
								<input type="text" 
									placeholder="Username or Mac Address" 
									class="input-xlarge" 
									required id="username" name="username" value="${user.username }" 
									<c:if test="${fn:length(user.username) > 0 }">disabled</c:if>
									/>
								<p class="help-block"></p>
							</div>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${user != null && user.enableuser == 1}">checked</c:if>
								 name="enableuser" value="1"/> 授权用户
							</label>
						</div>
						<div class="control-group">
							<div class="row">
								<div class="span4">
									<label class="control-label">User Type:</label>
								</div>
								<div class="span8">
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${user != null && user.acctype == 1}">checked</c:if>
										 name="acctype" value="1"/> 通用用户
									</label> 
									<br /> 
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${user != null && user.acctype == 2}">checked</c:if>
										name="acctype" value="2"/> Mikrotik Hotspot MAC 用户
									</label> 
									<br /> 
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${user != null && user.acctype == 3}">checked</c:if>
										name="acctype" value="3"/> Mikrotik 访问列表登录
									</label> 
									<br /> 
									<label class="radio" style="margin-bottom: 5px;" > 
										<input type="radio" 
										<c:if test="${user != null && user.acctype == 4}">checked</c:if>
										name="acctype" value="4"/> StarOS 访问列表登录
									</label>
								</div>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label id="cg-password" class="control-label">Password:</label>
							<div class="controls">
								<input type="password" placeholder="Passowrd" class="input-xlarge" required
									 id="password" name="password" value="${user.password }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">MAC地址:</label>
							<div class="controls">
								<input type="text" placeholder="Mac" class="input-xlarge" name="mac" value="${user.mac }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${user != null && user.usemacauth == 1}">checked</c:if>
								name="usemacauth"  /> 仅限此MAC地址
							</label>
						</div>
						<!-- <div class="control-group">
							<label class="control-label">同时在线数:</label>
							<div class="controls">
								<input type="text" placeholder="1" class="input-xlarge" name="" />
							</div>
						</div> -->
					</div>
					<div class="span4">
						<div id="cg-checkpwd" class="control-group">
							<label class="control-label">Check Password:</label>
							<div class="controls">
								<input type="password" placeholder="Check Password" class="input-xlarge" required id="checkpwd" name="checkpwd" value="${user.password }"/>
								<p class="help-block"></p>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">静态IP地址:</label>
							<div class="controls">
								<input type="text" placeholder="Static IP" class="input-xlarge" name="staticip" value="${user.staticip }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="checkbox"> 
								<input type="checkbox" 
								<c:if test="${user != null && user.usestaticip == 1}">checked</c:if>
								name="usestaticip"/> 用户静态IP地址
							</label>
						</div>
					</div>
				</div>
				
				<div>
					<legend>
						<h3 class="alert">设置项</h3>
					</legend>
				</div>
				<div class="row">
					<div class="span4">
						<div class="control-group">
							<label class="control-label">服务:</label>
							<div class="controls">
								<select name="srvSelect" id="srvSelect" class="input-xlarge">
									<c:forEach var="service" items="${services}">
										<option value="${service.srvid }@${service.srvname}"
										<c:if test="${user.service.srvid == service.srvid }">selected="selected"</c:if>
										>${service.srvname}</option>
									</c:forEach>
								</select>
								<input type="hidden" id="srvid" name="srvid" value="" />
								<input type="hidden" id="srvname" name="srvname" value="" /> 
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">下载限制:</label>
							<div class="controls">
								<input type="number" placeholder="" class="input-xlarge"  required name="downlimit" value="${user.downlimit }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">上传限制:</label>
							<div class="controls">
								<input type="number" placeholder="" class="input-xlarge"  required name="uplimit" value="${user.uplimit }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">合计限制:</label>
							<div class="controls">
								<input type="number" placeholder="" class="input-xlarge"  required name="comblimit" value="${user.comblimit }"/>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label class="control-label">账户到期:</label>
							<div class="controls">
								<input type="date" placeholder="" class="input-xlarge"  required name="expiration"  value="${user.expiration }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">可用联机时间:</label>
							<div class="controls">
								<input type="number" placeholder="" class="input-xlarge"  required name="uptimelimit" value="${user.uptimelimit }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">存款Deposit:</label>
							<div class="controls">
								<input type="number" placeholder="" class="input-xlarge"   required name="credits" value="${user.credits }"/>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label class="control-label">注释:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="comment" value="${user.comment }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">用户组:</label>
							<div class="controls">
								<select name="groupid" class="input-xlarge">
									<c:forEach var="group" items="${groups }">
										<option value="${group.groupid }"
										<c:if test="${user.groupid == group.groupid }">selected="selected"</c:if>
										>${group.groupname}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">CM MAC 地址:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="maccm" value="${user.maccm }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">自定义RADIUS属性:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="custattr" value="${user.custattr }" />
							</div>
						</div>
					</div>
				</div>
				<div>
					<legend>
						<h3 class="alert">用户信息</h3>
					</legend>
				</div>
				<div class="row-fluid">
					<div class="span4">
						<div class="control-group">
							<label class="control-label">姓氏:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="firstname" value="${user.firstname }" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">地址:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="address" value="${user.address }" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">国家:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="country" value="${user.country }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">手机:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="mobile" value="${user.mobile }"/>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label class="control-label">名字:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="lastname" value="${user.lastname }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">城市:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="city" value="${user.city }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">省(市):</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="state" value="${user.state }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">电子邮件:</label>
							<div class="controls">
								<input type="email" placeholder="" class="input-xlarge" name="email" value="${user.email }"/>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label class="control-label">公司</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="company" value="${user.company }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">邮编:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="zip" value="${user.zip }"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">固话:</label>
							<div class="controls">
								<input type="text" placeholder="" class="input-xlarge" name="phone" value="${user.phone }"/>
							</div>
						</div>
					</div>
				</div>
				<div class="control-group" style="margin-top: 20px;">
					<div class="controls">
						<input type="submit" name="createUserBtn" id="createUserBtn" value="${actionstr }" class="btn btn-large btn-primary" />
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
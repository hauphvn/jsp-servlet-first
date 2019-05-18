<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>DANH SACH BAI VIET</title>
</head>

<body>
	<div class="main-content">
	<form action="<c:url value='/admin-news'/>" id="formSubmit" method="get">
		<div class="main-content-inner">
			
				
				<div class="breadcrumbs ace-save-state" id=" ">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a
							href='<c:url value="/admin-home"/>'>Trang chủ</a></li>
					</ul>
					<!-- /.breadcrumb -->
				</div>
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>

											<th>Title</th>
											<th>Thumbnail</th>

										</tr>
									</thead>
									<tbody>
										<c:forEach items="${model.listResult}" var="item"
											varStatus="loop">
											<tr>

												<td>${item.title}</td>
												<td>${item.thumbnail}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<ul class="pagination" id="pagination"></ul>
								
								<input type="hidden" value="" id="page" name="page"/> 
									<input type="hidden" value="" id="maxItem" name="maxItem"/> 
									<input type="hidden" value="" id="sortName" name="sortName"/> 
									<input type="hidden" value="" id="sortBy" name="sortBy"/>
							</div>
						</div>
					</div>
				</div>
			
		</div>
		</form>
	</div>

	<!-- /.main-content -->
	<script>
	var totalPages = ${model.totalPage};
	var currentPage = ${model.page};
	var limit = 2;
	var maxItem = ${model.maxItem};
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages: totalPages,
				visiblePages: limit,
				startPage: currentPage,
				onPageClick: function (event, page) {
					if (currentPage != page) {
						$('#maxItem').val(maxItem);
						$('#page').val(page);
						$('#sortName').val('title');
						$('#sortBy').val('desc');
						$('#formSubmit').submit();
					}
				}
			});
		});
	</script>
</body>

</html>
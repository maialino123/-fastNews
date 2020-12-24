<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/tablib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách bài viết</title>
</head>
<body>

	<div class="main-content">
		<form action="<c:url value='/admin-new' />" id="fromSubmit"
			method="get">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
								chủ</a></li>
					</ul>
					<!-- /.breadcrumb -->
				</div>
				<div class="page-content">
					<div class="widget-box table-filter">
						<div class="table-btn-controls">
							<div class="pull-right tableTools-container">
								<div class="dt-buttons btn-overlap btn-group">
									<a flag="info"
										class="dt-button buttons-colvis btn btn-white btn-primary btn-bold"
										data-toggle="tooltip" title='Thêm bài viết'
										href=''> <span>
											<i class="fa fa-plus-circle bigger-110 purple"></i>
									</span>
									</a>
									<button id="btnDelete" type="button"
										class="dt-button buttons-html5 btn btn-white btn-primary btn-bold"
										data-toggle="tooltip" title='Xóa bài viết'>
										<span> <i class="fa fa-trash-o bigger-110 pink"></i>
										</span>
									</button>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-12">
							<div class="row">
								<div class="col-xs-12">
									<div class="table-reponsive">
										<table class="table table-bordered">
											<thead>
												<tr>
													<th>Tên bài viết</th>
													<th>Mô tả ngắn</th>
													<th>Thao Tác</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="item" items="${model.data}">
													<tr>
														<td>${item.title}</td>
														<td>${item.shortDescription}</td>
														<td><a class="btn btn-sm btn-primary btn-edit"
															data-toggle="tooltip" title="Cập nhật bài viết"
															href=''><i class="fa fa-pencil-square-o"
																aria-hidden="true"></i> </a></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
										<ul class="pagination pull-right" id="pagination"></ul>
										<input type="hidden" name="page" value="" id="page"> <input
											type="hidden" name="maxPage" value="" id="maxPage"> <input
											type="hidden" name="sortName" value="" id="sortName">
										<input type="hidden" name="sortBy" value="" id="sortBy">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>

	<!-- /.main-content -->

	<script type="text/javascript">
		var totalPage = $
		{
			model.totalPage
		};
		var currentPage = $
		{
			model.page
		};
		var limit = 3;
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPage,
				visiblePages : 10,
				startPage : currentPage,
				onPageClick : function(event, page) {
					if (currentPage != page) {
						$('#sortName').val("title");
						$('#sortBy').val("desc");
						$('#maxPage').val(limit);
						$('#page').val(page);
						$('#fromSubmit').submit();
					}
				}
			});
		});
	</script>


</body>
</html>
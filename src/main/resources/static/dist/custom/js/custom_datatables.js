const table = $("#datatables").DataTable({
    "select": false,
    //최초 표시시 정렬하기
    "order": [[1, "desc"]],
    "columns": [ //각 컬럼별 테이블 매핑
        {"target": 0, "data": "ALL", "orderable": false},
        {"target": 1, "data": "단어"},
        {"target": 2, "data": "뜻"},
        {"target": 3, "data": "맞은 횟수"},
        {"target": 4, "data": "틀린 횟수"},
    ],
    "scrollY": 410,
    "scrollX": true,
    "language": {
        "lengthMenu": "Show _MENU_",
    },
    "dom":
        "<'row'" +
        "<'col-sm-6 d-flex align-items-center justify-content-start' l>" +
        "<'col-sm-6 d-flex align-items-center justify-content-end' f>" +
        ">" +

        "<'table-responsive' tr>" +

        "<'row'" +
        "<'col-sm-12 col-md-5 d-flex align-items-center justify-content-center justify-content-md-start'i>" +
        "<'col-sm-12 col-md-7 d-flex align-items-center justify-content-center justify-content-md-end'p>" +
        ">"
});
const initJsTreeView = (data) => {
    console.log("jsTreeData", data);
    if (!data.length) {
        alert('JsTree 플러그인 로딩에 실패했습니다.');
        return false;
    }
    $("#jstree").jstree({
        "core": {
            "themes": {
                "responsive": false
            },
            "check_callback": true,
            "data": data,
        },
        "plugins": ["dnd", "contextmenu", "state", "types"]
    });
};

$.ajax({
    type: "get",
    url: "http://localhost:8080/js_tree_items",
    data: {}, // 전송 파라미터
    success: (response) => {
        initJsTreeView(response);
    },
    error: (err) => {
        console.error(err);
    }
})
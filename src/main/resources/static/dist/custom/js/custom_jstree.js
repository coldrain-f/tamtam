$("#jstree").jstree({
    "core": {
        "themes": {
            "responsive": false
        },
        "check_callback": true,
        "data": [
            {
                "text": "기초 단어",
                "icon": "fa fa-folder text-info",
                "children": [
                    {
                        "text": "단어가 읽기다 기본편",
                        "icon": "fa fa-folder text-primary",
                        "children": [
                            {
                                "text": "Unit 01 ~ Unit 10",
                                "icon": "fa fa-folder text-danger",
                                "children": [
                                    {"text": "Unit 01 - 요리", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 02 - 일상1", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 03 - 일상2", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 04 - 학교1", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 05 - 학교2", "icon": "fa fa-file text-success"}
                                ]
                            },
                            {"text": "Unit 11 ~ Unit 20", "icon": "fa fa-folder text-danger"},
                            {"text": "Unit 21 ~ Unit 30", "icon": "fa fa-folder text-danger"},
                            {"text": "Unit 31 ~ Unit 40", "icon": "fa fa-folder text-danger"}

                        ]
                    },
                    {
                        "text": "단어가 읽기다 실력편",
                        "icon": "fa fa-folder text-primary",
                        "children": [
                            {
                                "text": "Unit 01 ~ Unit 10",
                                "icon": "fa fa-folder text-danger",
                                "children": [
                                    {"text": "Unit 01 - 요리", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 02 - 일상1", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 03 - 일상2", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 04 - 학교1", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 05 - 학교2", "icon": "fa fa-file text-success"}

                                ]
                            },
                            {"text": "Unit 11 ~ Unit 20", "icon": "fa fa-folder text-danger"},
                            {"text": "Unit 21 ~ Unit 30", "icon": "fa fa-folder text-danger"},
                            {"text": "Unit 31 ~ Unit 40", "icon": "fa fa-folder text-danger"}

                        ]
                    },
                    {
                        "text": "단어가 읽기다 고등편",
                        "icon": "fa fa-folder text-primary",
                        "children": [
                            {
                                "text": "Unit 01 ~ Unit 10",
                                "icon": "fa fa-folder text-danger",
                                "children": [
                                    {"text": "Unit 01 - 요리", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 02 - 일상1", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 03 - 일상2", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 04 - 학교1", "icon": "fa fa-file text-success"},
                                    {"text": "Unit 05 - 학교2", "icon": "fa fa-file text-success"}

                                ]
                            },
                            {"text": "Unit 11 ~ Unit 20", "icon": "fa fa-folder text-danger"},
                            {"text": "Unit 21 ~ Unit 30", "icon": "fa fa-folder text-danger"},
                            {"text": "Unit 31 ~ Unit 40", "icon": "fa fa-folder text-danger"}

                        ]
                    }
                ]
            },
            {
                "text": "토익 900점",
                "icon": "fa fa-folder text-info",
                "children": [
                    {
                        "text": "토익 기출문제 단어 200선",
                        "icon": "fa fa-folder text-primary",
                        "children": []
                    }
                ]
            }
        ]
    },
    "plugins": ["dnd", "contextmenu", "state", "types"]
});
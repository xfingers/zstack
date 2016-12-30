package org.zstack.header.storage.primary



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
            url "GET /v1/primary-storage/types"

            header (OAuth: 'the-session-uuid')

            clz APIGetPrimaryStorageTypesMsg.class

            desc ""
            
			params {

				column {
					name "systemTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIGetPrimaryStorageTypesReply.class
        }
    }
}
package org.zstack.header.network.l3



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
            url "PUT /v1/l3-networks/{uuid}/actions"

            header (OAuth: 'the-session-uuid')

            clz APIUpdateL3NetworkMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "updateL3Network"
					desc "资源的UUID，唯一标示该资源"
					inUrl true
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "name"
					enclosedIn "updateL3Network"
					desc "资源名称"
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "description"
					enclosedIn "updateL3Network"
					desc "资源的详细描述"
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "system"
					enclosedIn "updateL3Network"
					desc ""
					inUrl false
					type "Boolean"
					optional true
					since "0.6"
					
				}
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
            clz APIUpdateL3NetworkEvent.class
        }
    }
}
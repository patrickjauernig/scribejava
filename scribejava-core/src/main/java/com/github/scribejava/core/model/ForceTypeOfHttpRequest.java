package com.github.scribejava.core.model;

public class ForceTypeOfHttpRequest {
		public static ForceTypeOfHttpRequest NONE = new ForceTypeOfHttpRequest("NONE");
		public static ForceTypeOfHttpRequest FORCE_ASYNC_ONLY_HTTP_REQUESTS = new ForceTypeOfHttpRequest("FORCE_ASYNC_ONLY_HTTP_REQUESTS");
		public static ForceTypeOfHttpRequest FORCE_SYNC_ONLY_HTTP_REQUESTS = new ForceTypeOfHttpRequest("FORCE_SYNC_ONLY_HTTP_REQUESTS");
		public static ForceTypeOfHttpRequest PREFER_ASYNC_ONLY_HTTP_REQUESTS = new ForceTypeOfHttpRequest("PREFER_ASYNC_ONLY_HTTP_REQUESTS");
		public static ForceTypeOfHttpRequest PREFER_SYNC_ONLY_HTTP_REQUESTS = new ForceTypeOfHttpRequest("PREFER_SYNC_ONLY_HTTP_REQUESTS");
		private String val;

		public ForceTypeOfHttpRequest(String val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return this.val;
		}
		
		public String name(){
			return this.val;
		}
		
		@Override
		public boolean equals(Object obj) {
			return obj instanceof ForceTypeOfHttpRequest && this.val.equals(((ForceTypeOfHttpRequest) obj).name());
		}
}



package com.codingwithmitch.mviexample.ui.main.statesealed class MainStateEvant {	class GetBlogPostEvent : MainStateEvant()	class GetUserEvant(val userId: String) : MainStateEvant()	class None : MainStateEvant()}
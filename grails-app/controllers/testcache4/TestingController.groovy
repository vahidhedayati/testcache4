package testcache4

import grails.plugin.cache.Cacheable
class TestingController {
	def testing

    def index() { 
	testing.serviceMethod()
	render "it works"
    }
}

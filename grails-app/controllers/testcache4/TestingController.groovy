package testcache4

import grails.plugin.cache.Cacheable
class TestingController {


    @Cacheable('country')
    def index() { 
	render "it works"
    }
}

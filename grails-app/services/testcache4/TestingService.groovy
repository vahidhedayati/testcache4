package testcache4

import grails.transaction.Transactional
import grails.plugin.cache.Cacheable

@Transactional
class TestingService {

	@Cacheable('country')
    def serviceMethod() {

    }
}

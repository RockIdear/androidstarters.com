package <%= appPackage %>.data.repository

import io.reactivex.Flowable
import <%= appPackage %>.data.model.BufferooEntity

/**
 * Interface defining methods for the caching of Bufferroos. This is to be implemented by the
 * cache layer, using this interface as a way of communicating.
 */
interface BufferooRemote {

    /**
     * Retrieve a list of Bufferoos, from the cache
     */
    fun getBufferoos(): Flowable<List<BufferooEntity>>

}
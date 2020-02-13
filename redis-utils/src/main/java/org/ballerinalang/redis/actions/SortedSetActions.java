/*
 * Copyright (c) 2020, WSO2 Inc. (http:www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http:www.apache.orglicensesLICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.ballerinalang.redis.actions;

import org.ballerinalang.jvm.BallerinaErrors;
import org.ballerinalang.jvm.values.HandleValue;
import org.ballerinalang.jvm.values.api.BArray;
import org.ballerinalang.jvm.values.api.BMap;
import org.ballerinalang.redis.RedisDataSource;

import static org.ballerinalang.redis.BallerinaRedisDbErrors.REDIS_EXCEPTION_OCCURRED;

public class SortedSetActions extends AbstractRedisAction {

    public static Object zAdd(HandleValue redisDataSourceHandleValue, String key, BMap memberScoreMap) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zAdd(key, redisDataSource, createMapFromBMap(memberScoreMap)).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zCard(HandleValue redisDataSourceHandleValue, String key) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zCard(key, redisDataSource).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zCount(HandleValue redisDataSourceHandleValue, String key, float min, float max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zCount(key, min, max, redisDataSource).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zIncrBy(HandleValue redisDataSourceHandleValue, String key, float amount, String member) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zIncrBy(key, amount, member, redisDataSource).floatValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zInterStore(HandleValue redisDataSourceHandleValue, String destination, BArray keys) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zInterStore(destination, redisDataSource, createStringArrayFromBArray(keys)).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zLexCount(HandleValue redisDataSourceHandleValue, String destination, String min, String max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zLexCount(destination, min, max, redisDataSource).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRange(HandleValue redisDataSourceHandleValue, String key, int min, int max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRange(key, min, max, redisDataSource);
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRangeByLex(HandleValue redisDataSourceHandleValue, String key, String min, String max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRangeByLex(key, min, max, redisDataSource);
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRevRangeByLex(HandleValue redisDataSourceHandleValue, String key, String min, String max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRevRangeByLex(key, min, max, redisDataSource);
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRangeByScore(HandleValue redisDataSourceHandleValue, String key, float min, float max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRangeByScore(key, min, max, redisDataSource);
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRank(HandleValue redisDataSourceHandleValue, String key, String memeber) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRank(key, memeber, redisDataSource).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRem(HandleValue redisDataSourceHandleValue, String key, BArray memebers) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRem(key, redisDataSource, createStringArrayFromBArray(memebers)).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRemRangeByLex(HandleValue redisDataSourceHandleValue, String key, String min, String max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRemRangeByLex(key, min, max, redisDataSource).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRemRangeByRank(HandleValue redisDataSourceHandleValue, String key, int min, int max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRemRangeByRank(key, min, max, redisDataSource).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRemRangeByScore(HandleValue redisDataSourceHandleValue, String key, float min, float max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRemRangeByScore(key, min, max, redisDataSource).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRevRange(HandleValue redisDataSourceHandleValue, String key, int min, int max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRevRange(key, min, max, redisDataSource);
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRevRangeByScore(HandleValue redisDataSourceHandleValue, String key, float min, float max) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRevRangeByScore(key, min, max, redisDataSource);
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zRevRank(HandleValue redisDataSourceHandleValue, String key, String member) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zRevRank(key, member, redisDataSource).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zScore(HandleValue redisDataSourceHandleValue, String key, String member) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zScore(key, member, redisDataSource).floatValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }

    public static Object zUnionStore(HandleValue redisDataSourceHandleValue, String destination, BArray keys) {
        try {
            RedisDataSource redisDataSource = (RedisDataSource) redisDataSourceHandleValue.getValue();
            return zUnionStore(destination, redisDataSource, createStringArrayFromBArray(keys)).intValue();
        } catch (Throwable e) {
            return BallerinaErrors.createError(REDIS_EXCEPTION_OCCURRED, e.getMessage());
        }
    }
}
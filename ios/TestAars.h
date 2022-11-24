
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNTestAarsSpec.h"

@interface TestAars : NSObject <NativeTestAarsSpec>
#else
#import <React/RCTBridgeModule.h>

@interface TestAars : NSObject <RCTBridgeModule>
#endif

@end

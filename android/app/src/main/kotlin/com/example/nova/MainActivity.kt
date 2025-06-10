package com.example.nova

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
}


// codemagic.yaml
workflows:
  default-workflow:
    name: Nova Build
    max_build_duration: 30
    environment:
      flutter: stable
      xcode: latest
      android_signing:
        keystore_reference: nova_keystore
    scripts:
      - name: Build APK
        script: |
          flutter pub get
          flutter build apk --release
    artifacts:
      - build/app/outputs/flutter-apk/app-release.apk

/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tmp.texugo.util;

import java.util.concurrent.ConcurrentMap;

/**
 * A thing which can have named attachments.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public interface Attachable {
    Object getAttachment(String name);

    Object putAttachment(String name, Object value);

    Object putAttachmentIfAbsent(String name, Object value);

    Object replaceAttachment(String name, Object newValue);

    Object removeAttachment(String name);

    boolean replaceAttachment(String name, Object expectValue, Object newValue);

    boolean removeAttachment(String name, Object expectValue);

    ConcurrentMap<String, Object> getAttachments();
}

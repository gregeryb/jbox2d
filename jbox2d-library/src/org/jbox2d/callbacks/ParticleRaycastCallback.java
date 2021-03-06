package org.jbox2d.callbacks;

import java.io.Serializable;
import org.jbox2d.common.Vec2;

public interface ParticleRaycastCallback extends Serializable {

 static final long serialVersionUID = 1L;

 /**
  * Called for each particle found in the query. See
  * {@link RayCastCallback#reportFixture(org.jbox2d.dynamics.Fixture, Vec2, Vec2, float)} for
  * argument info.
  *
  * @param index
  * @param point
  * @param normal
  * @param fraction
  * @return
  */
 float reportParticle(int index, Vec2 point, Vec2 normal, float fraction);
}
